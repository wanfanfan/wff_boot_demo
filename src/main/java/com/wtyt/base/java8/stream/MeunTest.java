package com.wtyt.base.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class MeunTest {
	private static List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	public static void main(String[] args) {
		List<String> lowCaloricDishesName = menu.stream().filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());
		for (String dish : lowCaloricDishesName) {
			System.out.println(dish);
		}
		Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
		//dishesByType.getOrDefault(key, defaultValue);
		//dishesByType.computeIfAbsent(key, mappingFunction);
		if (menu.stream().anyMatch(Dish::isVegetarian)) {
			System.out.println("******&*&^");
		}
		if (menu.stream().allMatch(d -> d.getCalories() < 1000)) {
			System.out.println("******)()(&*(");
		}

		Optional<Dish> dishs = menu.stream().filter(Dish::isVegetarian).findAny();
		menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(d -> System.out.println(d.getName()));

		int calories = menu.stream().mapToInt(Dish::getCalories).sum();
		System.out.println("calories:" + calories);
		Stream<Integer> stream = menu.stream().mapToInt(Dish::getCalories).boxed();
		IntStream evenNumbers = IntStream.range(1, 100).filter(n -> n % 2 == 0);
		System.out.println(evenNumbers.count());
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.replaceAll(x -> x * 2);
		System.out.println(numbers);
	}
}
