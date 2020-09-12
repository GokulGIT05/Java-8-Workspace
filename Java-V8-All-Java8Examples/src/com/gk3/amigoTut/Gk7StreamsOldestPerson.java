package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;

public class Gk7StreamsOldestPerson {

	public static void main(String[] args) {

		List<Person> persons = loadPersons();
		persons.forEach(p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// To find oldest Women in the list
		Optional<Person> maxFemalePerson = persons.stream()
				.filter(peoples -> peoples.getGender().equals(Gender.FEMALE))
				.max(Comparator.comparing(Person::getAge));
		System.out.println("Oldest Women in the List: "+maxFemalePerson.get());
		System.out.println("-------------------------------------------------");
		
		// To find oldest Man in the list
		Optional<String> oldManName = persons.stream()
				.filter(person -> person.getGender().equals(Gender.MALE))
				.max(Comparator.comparing(Person::getAge)).map(p -> p.getName());

		System.out.println("Oldest Man in the List: " + oldManName.get());
	}

	private static List<Person> loadPersons() {

		return Arrays.asList(new Person("Gokul", 26, Gender.MALE), new Person("Rahul", 21, Gender.MALE),
				new Person("Mala", 51, Gender.FEMALE), new Person("Geetha", 23, Gender.FEMALE));
	}

}
