package com.wtyt.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * 启动类
 * 
 * @author Administrator
 *
 */
@Component
@Order(value = 1)
public class StartUp implements CommandLineRunner {

	private static final Logger log = LogManager.getLogger(StartUp.class);

	@Override
	public void run(String... args) throws Exception {
		log.info("进入我的demo项目启动！！！");	
	}

	

}
