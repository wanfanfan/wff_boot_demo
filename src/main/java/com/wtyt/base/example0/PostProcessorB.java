package com.wtyt.base.example0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class PostProcessorB implements BeanPostProcessor,Ordered {
	
	private static final Logger log = LoggerFactory.getLogger(PostProcessorB.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("narCodeService".equals(beanName)) {
			log.info("》》》》后置处理器B处理bean=【" + beanName + "】开始");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return bean;
		}
        return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("narCodeService".equals(beanName)) {
			log.info("》》》》后置处理器B处理bean=【" + beanName + "】完毕!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return bean;
		}
        return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
