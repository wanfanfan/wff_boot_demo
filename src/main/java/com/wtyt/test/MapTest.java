package com.wtyt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(1, "张三", "男", 38));
		personList.add(new Person(2, "小小", "女", 2));
		personList.add(new Person(3, "李四", "男", 65));
		personList.add(new Person(4, "王五", "女", 20));
		personList.add(new Person(5, "赵六", "女", 38));
		personList.add(new Person(6, "大大", "男", 65));

		List<String> nameList = personList.stream().map(Person::getName).collect(Collectors.toList());
		System.out.println(nameList.toString());

		List<Integer> idList = personList.stream().mapToInt(Person::getId).boxed().collect(Collectors.toList());
		System.out.println(idList.toString());

		Map<Integer, Person> personMap = personList.stream().collect(Collectors.toMap(Person::getId, person -> person));
		System.out.println(personMap.toString());

		Map<Integer, String> nameMap = personList.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		System.out.println(nameMap.toString());

		Map<Integer, List<Person>> ageMap = personList.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(ageMap.toString());

		Integer minAge = personList.stream().mapToInt(Person::getAge).min().getAsInt();
		System.out.println(minAge);

		long count = personList.stream().filter(p -> p.getAge() > 20).filter(p -> "男".equals(p.getSex())).count();
		System.out.println(count);

		List<Person> xx = personList.stream().filter(p -> p.getAge() > 20).filter(p -> "男".equals(p.getSex()))
				.collect(Collectors.toList());
		System.out.println(xx);

		String[] arr = { "asd", "as", "eadd", "abc", "bcd" };
		Arrays.stream(arr).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

		// Arrays.stream(arr).sorted(Comparator.comparing(this::com1).thenComparing(String::length)).forEach(System.out::println);

		Collections.sort(personList, (x, y) -> x.getAge().compareTo(y.getAge()));
		System.out.println(personList.toString());

		String name = personList.stream().sorted(Comparator.comparingInt(Person::getAge)).findFirst().get().getName();
		System.out.println(name);
	}

	public static char com1(String x) {
		return x.charAt(0);
	}

}
