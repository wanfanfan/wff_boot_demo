package com.wtyt.base.java8.stream;

import java.util.Optional;

import com.wtyt.base.java8.stream.bean.Car;
import com.wtyt.base.java8.stream.bean.Insurance;
import com.wtyt.base.java8.stream.bean.Person;

public class OptionTest {

	public static void main(String[] args) {
		Person person = new Person();
		Optional<Person> optPerson = Optional.of(person);
		//System.out.println(getCarInsuranceName(optPerson));
	}

	/*public static String getCarInsuranceName(Optional<Person> person) {
		return person.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
	}*/

	public static Optional<Integer> stringToInt(String s) {
		try {
			return Optional.of(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
	}
}
