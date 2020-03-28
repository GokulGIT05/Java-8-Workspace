package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.List;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk5StreamsMatch {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// 1. All Match
		// All entry in list should satisfy the condition
		boolean allMatchCondition = persons.stream()
											.allMatch(person -> person.getAge() > 10);
		System.out.println("AllMatch Conditions is: " +allMatchCondition);
		System.out.println("-------------------------------------------------");
		
		// 2. AnyMatch
		// At-least one entry should satisfy the condition
		boolean anyMatch = persons.stream()
							.anyMatch(person -> person.getAge() < 20);
		System.out.println("AnyMatch Condition: " +anyMatch);
		System.out.println("-------------------------------------------------");
		
		// 3. None Match
		// If condition is not satisfied with any entry. then. it vice versa of anymatch.
		boolean noneMatch = persons.stream()
								.noneMatch(person -> person.getName().equals("Gopi"));
		System.out.println("NoneMatch Conditions "+ noneMatch );
		System.out.println("-------------------------------------------------");
		
		
	}

	private static List<Person> loadPersons() {

		return Arrays.asList(new Person("Gokul", 26, Gender.MALE), new Person("Rahul", 21, Gender.MALE),
				new Person("Mala", 51, Gender.FEMALE), new Person("Geetha", 23, Gender.FEMALE));
	}

}
