package com.wtyt.test;

import java.util.Map;
import java.util.Objects;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

public class Java8Map {

	public static void main(String[] args) {
		Map<String, Object> map1 = Maps.newHashMap();
		String aa="asd,123,2345345,,sfe8,4564,5";
		
		System.out.println(Splitter.on(",").splitToList(aa).toString());
		Objects.equals("asda", null);
		
	}

}
