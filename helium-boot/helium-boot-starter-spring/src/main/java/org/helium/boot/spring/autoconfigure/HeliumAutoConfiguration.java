package org.helium.boot.spring.autoconfigure;

import org.helium.boot.spring.annotation.EnableHeliumConfiguration;

import org.helium.boot.spring.health.HeliumHealthIndicator;
import org.helium.boot.spring.task.TaskImplementationAnnotationBeanPostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertyResolver;

import java.util.Set;

import static java.util.Collections.emptySet;

@Configuration
@ConditionalOnBean(annotation = EnableHeliumConfiguration.class)
public class HeliumAutoConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(HeliumAutoConfiguration.class);


	@Bean
	public HeliumHealthIndicator heliumHealthIndicator() {
		return new HeliumHealthIndicator();
	}

//	@Bean
//	public ServiceSetterBeanPostProcessor serviceSetterBeanPostProcessor() {
//		return new ServiceSetterBeanPostProcessor();
//	}
//
//	@Bean
//	public TaskEventBeanPostProcessor taskEventBeanPostProcessor() {
//		return new TaskEventBeanPostProcessor();
//	}


	/**
	 * Creates {@link TaskImplementationAnnotationBeanPostProcessor} Bean
	 *
	 * @param propertyResolver {@link PropertyResolver} Bean
	 * @return {@link TaskImplementationAnnotationBeanPostProcessor}
	 */
	@ConditionalOnProperty(prefix = HeliumConfig.PREFIX, name = "task")
	@Bean
	public TaskImplementationAnnotationBeanPostProcessor taskImplementationAnnotationBeanPostProcessor( PropertyResolver propertyResolver) {
		Set<String> packagesToScan = propertyResolver.getProperty(HeliumConfig.PREFIX + "task", Set.class, emptySet());
		return new TaskImplementationAnnotationBeanPostProcessor(packagesToScan);
	}


}
