package com.gk3.amigoTut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;


public class Gk2DeclarativeProgramming {
	

    public static void main(String[] args) {

        List<Person> persons = loadPersons();
        System.out.println("All Persons: " + persons);
        System.out.println("-------------------------------------------------");

        // Declarative Approach
        // Filtered Persons
        List<Person> femalefilteredPeoples = persons.stream()
                .filter( p -> Gender.FEMALE.equals(p.getGender()))
                .collect(Collectors.<Person>toList());

        // To Print
        femalefilteredPeoples.forEach(female -> System.out.println("Female Persons using Declarative Approach: "+ female.getName()));
        System.out.println("-------------------------------------------------");

        // Do it in single line
        persons.stream()
                .filter( p -> Gender.FEMALE.equals(p.getGender()))
                 .forEach(female -> System.out.println("Female Persons using Declarative Approach in Single Line: "+ female.getName()));
        System.out.println("-------------------------------------------------");
    }

	private static List<Person> loadPersons() {
		return Arrays.asList(
                new Person("Gokul",Gender.MALE),
                new Person("Rahul",Gender.MALE),
                new Person("Mala",Gender.FEMALE),
                new Person("Geetha",Gender.FEMALE)
        );
	}

}
