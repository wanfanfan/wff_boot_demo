package com.wtyt.base.java8.chap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import static java.util.Comparator.comparing;

public class FilteringApples {
	public static void main(String... args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"),
				new Apple(170, "red"));
		List<Apple> result2 = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
		inventory.sort(new Comparator<Apple>() {
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		// 静态方法
		inventory.sort(comparing((a) -> a.getWeight()));
		// 方法引用
		inventory.sort(comparing(Apple::getWeight));
		inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
		for (Apple apple : inventory) {
			// System.out.println("color:" + apple.getColor() + ",weight:" +
			// apple.getWeight());
		}
		//
		int portNumber = 1337;
		Runnable r = () -> System.out.println(portNumber);
		Apple apple1 = new Apple(166, "red");
		r = () -> System.out.println(apple1);
		// apple1 = new Apple(1626, "red");
		Integer.parseInt("1");
		// Integer::parseInt;
		List<String> str = Arrays.asList("a", "b", "A", "B");
		// str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		str.sort(String::compareToIgnoreCase);
		for (String s : str) {
			// System.out.println(s);
		}
		Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
		stringToInteger = Integer::parseInt;
		BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
		contains = List::contains;

		List<Integer> weights = Arrays.asList(7, 3, 4, 10);
		// weights.sort(Integer::compareTo);
		List<Apple> apples = map(weights, Apple::new);
		// apples.sort(c);
		for (Apple apple : apples) {
			// System.out.println(apple.getWeight());
		}

		//
		java.util.function.Predicate<Apple> redApple = a -> "red".equals(a.getColor());
		java.util.function.Predicate<Apple> otherApple = redApple.negate();
		otherApple = redApple.and(a -> a.getWeight() > 150).or(a -> "green".equals(a.getColor()));
		List<Apple> otherApples = filter2(inventory, otherApple);
		for (Apple apple : otherApples) {
			System.out.println("color:" + apple.getColor() + ",weight:" + apple.getWeight());
		}
	}

	public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
		List<Apple> result = new ArrayList<>();
		for (Integer e : list) {
			result.add(f.apply(e));
		}
		return result;
	}

	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : list) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}

	public static <T> List<T> filter2(List<T> list, java.util.function.Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : list) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
}
