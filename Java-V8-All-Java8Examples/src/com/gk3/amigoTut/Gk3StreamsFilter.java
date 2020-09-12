package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk3StreamsFilter {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// Filter all male employees
		List<Person> malePersons = persons.stream()
								.filter(localPerson -> localPerson.getGender().equals(Gender.MALE))
								.collect(Collectors.toList());
		
		malePersons.forEach(System.out::println);
		
	}

	private static List<Person> loadPersons() {
		return Arrays.asList(new Person("Gokul", Gender.MALE), new Person("Rahul", Gender.MALE),
				new Person("Mala", Gender.FEMALE), new Person("Geetha", Gender.FEMALE));
	}

}
