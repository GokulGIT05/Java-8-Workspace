package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk5StreamsMaxMin {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");
		
		// Max
		// We can use optional
		System.out.println("Max:: ");
		persons.stream()
			.max(Comparator.comparing(Person::getAge))
			.ifPresent(System.out::println);
		 
		System.out.println("-------------------------------------------------");
		
		// Min
		System.out.println("Min:: ");
		persons.stream()
				.min(Comparator.comparing(Person::getAge))
				.ifPresent(System.out::println);
		
		
	}

	private static List<Person> loadPersons() {

		return Arrays.asList(new Person("Gokul", 26, Gender.MALE), new Person("Rahul", 21, Gender.MALE),
				new Person("Mala", 51, Gender.FEMALE), new Person("Geetha", 23, Gender.FEMALE));
	}

}
