package com.wtyt.base.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class TestClassB {
	public void printClass() {
		System.out.println("This is Class B: " + this);
	}
}
