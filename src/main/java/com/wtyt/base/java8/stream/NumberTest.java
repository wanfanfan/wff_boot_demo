package com.wtyt.base.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class NumberTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// 返回平方
		List<Integer> squareList = list.stream().map(i -> i * i).collect(toList());
		for (Integer i : squareList) {
			System.out.print(i + " ");
		}
		System.out.println();
		List<Integer> listx = Arrays.asList(1, 2, 3);
		List<Integer> listy = Arrays.asList(3, 4);
		List<Integer[]> listparis = listx.stream()
				.flatMap(i -> listy.stream().filter(j -> (i + j) % 3 == 0).map(j -> new Integer[] { i, j }))
				.collect(toList());
		for (Integer[] integers : listparis) {
			System.out.println("(" + integers[0] + "," + integers[1] + ")" + " ");
		}
		Optional<Integer> thenumber = list.stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst();
		thenumber.ifPresent(x -> System.out.println("thenumber:" + thenumber));

		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		sum = list.stream().reduce(0, Integer::sum);
		System.out.println("sum:" + sum);
	}

}
