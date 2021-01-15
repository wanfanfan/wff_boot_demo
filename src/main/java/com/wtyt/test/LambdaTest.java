package com.wtyt.test;

public class LambdaTest {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hahaha");

			}
		}).start();

		new Thread(() -> {
			System.out.println("aasdsadsa");
		}).start();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("heiheiehie");

			}
		};

		Runnable r2 = () -> {
			System.out.println("asdasdsad");
		};

		r1.run();
		r2.run();
	}

}
