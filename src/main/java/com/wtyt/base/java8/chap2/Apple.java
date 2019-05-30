package com.wtyt.base.java8.chap2;

public class Apple {
	
	private Integer weight;
	private String color;

	public Apple(int weight, String color) {
		this.setWeight(weight);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
