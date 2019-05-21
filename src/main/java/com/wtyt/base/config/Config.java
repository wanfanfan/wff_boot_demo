package com.wtyt.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public TestBean testBean(){
		return new TestBean();
	}
}
