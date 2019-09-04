package org.helium.perfmon.recoder;

import org.helium.perfmon.observation.Observable;
import org.helium.perfmon.observation.ObserverManager;
import org.helium.perfmon.observation.ObserverReport;
import org.helium.perfmon.observation.ObserverReportMode;
import com.feinno.superpojo.type.TimeSpan;
import org.helium.threading.DelayRunner;
import org.helium.threading.SimpleQueuedWorker;
import org.helium.util.Tuple;
import org.helium.database.ConnectionString;
import org.helium.framework.BeanContext;
import org.helium.framework.annotations.ServiceImplementation;
import org.helium.framework.configuration.ConfigProvider;
import org.helium.framework.entitys.PerfmonCountersConfiguration;
import org.helium.framework.entitys.PerfmonCountersConfiguration.CounterNode;
import org.helium.framework.service.DummyServiceObject;
import org.helium.framework.tag.Initializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.sql.SQLException;


/**
 *
 * <b>描述: </b>WorkerAgent负责和HACenter建立长连接, 并保持心跳, 自动重连
 * <p>
 * <b>功能: </b>
 * <p>
 * <b>用法: </b>
 * <p>
 *
 * @author Lv.Mingwei
 *
 */
@ServiceImplementation(id = "helium:PerfmonRecorder")
public class PerfmonRecorder implements DummyServiceObject {
	/** 日志引用 */
	private static Logger LOGGER = LoggerFactory.getLogger(PerfmonRecorder.class);

	private static Marker MARKER = MarkerFactory.getMarker("PERFMON");

	/** 日期格式 */
	private String dateFormat = "yyyyMMdd";

	/** 表名 */
	private String tableNameFormat = "PERFMON_${COUNTER}_${DATE}";

	/** 配置文件 */
	private String configFile = "perfmon.xml";

	private PerfmonCountersConfiguration configuration;

	private SimpleQueuedWorker<Tuple<CounterRecorder, ObserverReport>> reportWorker;

	@Initializer
	public void initialize() {
		ConfigProvider configProvider = BeanContext.getContextService().getService(ConfigProvider.class);
		try {
			configuration = configProvider.loadXml(configFile, PerfmonCountersConfiguration.class);
		} catch (Exception ex) {
			LOGGER.error(MARKER, "no <perfmon.xml> found, PerfmonRecorder disabled", ex);
			return;
		}

		ConnectionString connStr = ConnectionString.builder()
				.jdbcUrl(configuration.getDatabase().getJdbcUrl())
				.user(configuration.getDatabase().getUser())
				.password(configuration.getDatabase().getPassword())
				.toConnStr();

		// Database db = DatabaseManager.INSTANCE.getDatabase("MONDB.LOCAL", connStr);

		//
		// 因为存在不少计数器初始化比较晚的问题, 等系统完全初始化完成后再加载计数器
		int delaySeconds = configuration.getDelaySeconds();
		if (delaySeconds <= 0) {
			delaySeconds = PerfmonCountersConfiguration.DEFAULT_DELAY_SECONDS;
		}
 		DelayRunner.run(delaySeconds, () -> {
			reportWorker = new SimpleQueuedWorker<>("perfmonRecorder", t -> {
			    CounterRecorder recorder = t.getV1();
			    try {
				    recorder.saveReport(t.getV2());
			    } catch (SQLException ex) {
				    LOGGER.error("Save recorder failed:{}", ex.getMessage());
			    }
		    });

			for (CounterNode node : configuration.getCounters()) {
				String category = node.getCounterName();
				LOGGER.info(MARKER, "Perfmon add category:{}", category);

				Observable ob = ObserverManager.getObserverItem(category);
				if (ob == null) {
					LOGGER.error(MARKER, "Unknown perfmon category={}", category);
					continue;
				}
				CounterRecorder counterRecorder = new CounterRecorder(ob, connStr, dateFormat, tableNameFormat);

				TimeSpan span = new TimeSpan(1000 * node.getInterval());
				if (span.getTotalSeconds() < 30) {
					LOGGER.error("Unsupported interval < 30 seconds category={}", category);
					continue;
				}

				ObserverManager.addInspector(ob, ObserverReportMode.ALL, span, counterRecorder.getReportCallback(
						t -> reportWorker.enqueue(t)
				));
			}
		});
	}
}
