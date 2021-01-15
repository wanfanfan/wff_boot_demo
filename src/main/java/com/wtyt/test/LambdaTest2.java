package com.wtyt.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest2 {

	public static void main(String[] args) {

		String[] arr = { "asda", "sdfsf", "xcvxvx", "sret" };

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {

				return s1.compareTo(s2);
			}

		});

		Arrays.sort(arr, (s1, s2) -> s1.compareTo(s2));

		List<String> list = Arrays.asList("asdasd", "sdfsdfds", "werwr");
		list.forEach(v -> 
			System.out.println(v)
		);
		list.forEach(System.out::println);

	}

}
