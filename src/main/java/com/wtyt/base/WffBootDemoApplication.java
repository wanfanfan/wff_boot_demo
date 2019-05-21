package com.wtyt.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan
@ComponentScan(basePackages={"com.wtyt.base"})
@SpringBootApplication
public class WffBootDemoApplication extends SpringBootServletInitializer{
	

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WffBootDemoApplication.class);        
    }
 
    public static void main(String[] args) {
        SpringApplication.run(WffBootDemoApplication.class, args);
    }
	
}
