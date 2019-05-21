package com.wtyt.base.config;

import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest1 {

	private static final Logger log = LoggerFactory.getLogger(MyTest1.class);

	@Test
	public void simpleTest() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// populate the factory with bean definitions

		// now register any needed BeanPostProcessor instances
		factory.addBeanPostProcessor(new AutowiredAnnotationBeanPostProcessor());
		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();
		cfg.setLocation(new FileSystemResource("jdbc.properties"));
		new DefaultResourceLoader().getResource(ResourceUtils.CLASSPATH_URL_PREFIX);
	}

	@Test
	public void testSpel() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.bytes.length"); 
		int length = (Integer) exp.getValue();
		log.info("length：" + length);
		exp = parser.parseExpression("new String('hello world').toUpperCase()"); 
		String message = exp.getValue(String.class);
		log.info("message：" + message);
		//
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);

	}

}
