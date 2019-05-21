package com.wtyt.base.example0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component("beanFactoryPostProcessorTest")
public class BeanFactoryPostProcessorTest implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,SmartLifecycle {

	private static final Logger log = LoggerFactory.getLogger(BeanFactoryPostProcessorTest.class);
	private String name = "张三";
    private String sex = "男";
    
    public BeanFactoryPostProcessorTest(){
    	log.info("BeanFactoryPostProcessorTest初始化");
    	this.name = "王五";
    	this.sex = "女";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void setBeanFactory(BeanFactory paramBeanFactory)
            throws BeansException {
        log.info("》》》调用了BeanFactoryAware的setBeanFactory方法了");
    }

    @Override
    public void setBeanName(String paramString) {
        log.info("》》》调用了BeanNameAware的setBeanName方法了");
    }

    @Override
    public void destroy() throws Exception {
        log.info("》》》调用了DisposableBean的destroy方法了");        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("》》》调用了Initailization的afterPropertiesSet方法了");
    }

    @Override
    public String toString() {
        return "BeanFactoryPostProcessorTest [name=" + name + ", sex=" + sex
                + "]";
    }

	@Override
	public void start() {
		log.info("》》》调用了SmartLifecycle的start方法了");
	}

	@Override
	public void stop() {
		log.info("》》》调用了SmartLifecycle的stop方法了");
	}

	@Override
	public boolean isRunning() {
		log.info("》》》调用了SmartLifecycle的isRunning方法了");
		return false;
	}

	@Override
	public int getPhase() {
		log.info("》》》调用了SmartLifecycle的getPhase方法了");
		return Integer.MIN_VALUE;
	}

	@Override
	public boolean isAutoStartup() {
		log.info("》》》调用了SmartLifecycle的isAutoStartup方法了");
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		log.info("》》》调用了SmartLifecycle的stop方法了");
		
	}

}
