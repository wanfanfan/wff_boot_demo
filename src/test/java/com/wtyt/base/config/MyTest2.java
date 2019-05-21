package com.wtyt.base.config;

import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import com.wtyt.base.example2.ResultMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest2 {
	
	private static final Logger log = LoggerFactory.getLogger(MyTest2.class);

	@Autowired
	private ResultMessage message;
	
	@Autowired
	private Environment env;
	
	@Before
	public void prepare(){
		System.setProperty("TEST_WFF", "哈哈哈哈");
	}

	@Test
	public void simpleTest() {
		System.out.println(message);
		log.info("***********" + System.getProperty("TEST_WFF"));
		@SuppressWarnings("resource")
		ApplicationContext ctx = new GenericApplicationContext();
		Environment env = ctx.getEnvironment();
		boolean containsMyProperty = env.containsProperty("TEST_WFF");
		log.info("Does my environment contain the 'TEST_WFF' property? " + containsMyProperty);
		log.info("env中的参数：" + env.getProperty("TEST_WFF"));
		log.info("this.env中的参数：" + this.env.getProperty("TEST_WFF"));
		Properties prop = System.getProperties();
		log.info("prop中的参数：" + prop.getProperty("TEST_WFF"));
		Map<String, String> envMap = System.getenv();
		log.info("envMap中的参数:" + envMap.get("TEST_WFF"));
		for (Map.Entry<String, String> entry : envMap.entrySet()) {
			log.info("key:" + entry.getKey() + "，value：" + entry.getValue());
		}
		ctx.getResource("");
	}

}
