package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk4StreamsSort {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// 1. Sort By Age
		List<Person> sortByAge = persons.stream().sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		sortByAge.forEach(System.out::println);
		System.out.println("-------------------------------------------------");

		// 2. Sort By Age - Reversed
		List<Person> sortByAgeReversed = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());

		sortByAgeReversed.forEach(System.out::println);
		System.out.println("-------------------------------------------------");

		// 3. Sort by multiple Parameters
		List<Person> sortByAgeAndName = persons.stream()
				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
				.collect(Collectors.toList());
		// This is best in java 8. If i want to achieve the same then i need to write
		// lot of line of codes.
		sortByAgeAndName.forEach(System.out::println);

	}

	private static List<Person> loadPersons() {

		return Arrays.asList(new Person("Gokul", 26, Gender.MALE), new Person("Rahul", 21, Gender.MALE),
				new Person("Mala", 51, Gender.FEMALE), new Person("Geetha", 21, Gender.FEMALE));
	}

}
