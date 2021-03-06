package org.helium.cloud.logger.writer.spi;

import com.alibaba.fastjson.JSONObject;
import org.helium.cloud.common.utils.SpringContextUtil;
import org.helium.cloud.configcenter.ConfigCenterClient;
import org.helium.cloud.logger.entity.LogBean;
import org.helium.kafka.UkProducer;
import org.helium.kafka.spi.producer.UkProducerManager;
import org.helium.logging.LogAppender;
import org.helium.logging.spi.LogEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class KafkaLogAppender implements LogAppender {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaLogAppender.class);

    private String group;

    private String kafkaConfig;

    private UkProducer ukProducer;

    private volatile boolean open = false;

    private String platform = "cincloud";

    private String applicationName = "service";

    private String ownerAddress = "127.0.0.1";


    @Override
    public void open() {
        if (!open) {
            synchronized (this) {
                if (StringUtils.isEmpty(kafkaConfig)) {
                    LOGGER.error("logger kafkaLocation config is empty!");
                }
                ConfigCenterClient configCenterClient = SpringContextUtil.getBean(ConfigCenterClient.class);
                String content = configCenterClient.get(kafkaConfig, group);
                ukProducer = UkProducerManager.INSTANCE.getKafkaProducer(kafkaConfig, content);
                open = true;
                try {
                    InetAddress addr = InetAddress.getLocalHost();
                    ownerAddress = addr.getHostAddress();
                } catch (UnknownHostException e) {
                    ownerAddress = "127.0.0.1";
                }
            }
        }

    }

    @Override
    public void close() {

    }

    @Override
    public boolean needQueue() {
        return true;
    }

    /**
     * 不支持debug级别日志
     *
     * @param event
     */
    @Override
    public void writeLog(LogEvent event) {
        try {
            if (StringUtils.isEmpty(event.getLoggerName())) {
                return;
            }
            if (event.getLoggerName().startsWith("org.helium.kafka") || event.getLoggerName().startsWith("org.apache.kafka")) {
                System.out.println(event.getMessage());
                return;
            }
            LogBean logBean = new LogBean();
            logBean.setLevel(event.getLevel().toString());
            logBean.setTime(event.getTime().getTime());
            logBean.setPlatform(platform);
            logBean.setBusiness(applicationName);
            logBean.setType("trace-log");
            logBean.setOwnerAddress(ownerAddress);
            logBean.setName(event.getLoggerName());
            logBean.setEvent(event);
            String json = JSONObject.toJSONString(logBean, true);
            ukProducer.produce(json.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setKafkaConfig(String kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public void setUkProducer(UkProducer ukProducer) {
        this.ukProducer = ukProducer;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
