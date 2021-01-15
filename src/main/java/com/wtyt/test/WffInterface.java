package com.wtyt.test;

@FunctionalInterface
public interface WffInterface {

	void method();

	// @Override
	boolean equals(Object obj);

	default void defaultMethod() {
	}

	static void staticMethod() {
	};

	public static void main(String[] args) {
		WffInterface inter = () -> System.out.println("xxx");
		inter.method();
		WffClass c = new WffClass();
		c.method();

	}
	
	class WffClass implements WffInterface{

		@Override
		public void method() {
			System.out.println("sadasda");
			
		}
		
	}

}
