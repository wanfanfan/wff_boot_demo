package com.wtyt.base.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TestClassA
// implements ApplicationContextAware
{

	// private ApplicationContext applicationContext;

	@Autowired
	TestClassB classB;

	public void printClass() {
		System.out.println("This is Class A: " + this);
		getClassB().printClass();
	}

	@Lookup
	public TestClassB getClassB() {
		// return applicationContext.getBean(TestClassB.class);
		return null;
	}

	/*
	 * @Override public void setApplicationContext(ApplicationContext
	 * applicationContext) throws BeansException { this.applicationContext =
	 * applicationContext; }
	 */

}
