package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk6StreamsGroup {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// Grouping my gender
		Map<Gender, List<Person>> genderMap = persons.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		genderMap.forEach((key,values) -> 
		{
				System.out.println(key);
				values.forEach(System.out::println);
				System.out.println();
		});

	}

	private static List<Person> loadPersons() {

		return Arrays.asList(new Person("Gokul", 26, Gender.MALE), new Person("Rahul", 21, Gender.MALE),
				new Person("Mala", 51, Gender.FEMALE), new Person("Geetha", 23, Gender.FEMALE));
	}

}
