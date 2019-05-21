package com.wtyt.base.example0;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class FactoryPostProcessor implements BeanFactoryPostProcessor {
	
	private static final Logger log = LoggerFactory.getLogger(FactoryPostProcessor.class);

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		log.info("******调用了BeanFactoryPostProcessor");
		String[] beanStr = beanFactory.getBeanDefinitionNames();
		for (String beanName : beanStr) {
			if ("beanFactoryPostProcessorTest".equals(beanName)) {
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
				log.info("beanClassName:" + beanDefinition.getBeanClassName());
				MutablePropertyValues m = beanDefinition.getPropertyValues();
				List<PropertyValue> list = m.getPropertyValueList();
				for (PropertyValue pv : list) {
					log.info("name:" + pv.getName() );
					log.info("value:" + pv.getValue());
				}
				
				if (m.contains("name")) {
					m.addPropertyValue("name", "赵四");
					log.info("》》》修改了name属性初始值了");
				}
			}
		}
	}

}
