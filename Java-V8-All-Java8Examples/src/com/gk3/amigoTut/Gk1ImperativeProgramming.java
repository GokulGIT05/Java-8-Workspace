package com.gk3.amigoTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gk2.amigoTut.pojo.Gender;
import com.gk2.amigoTut.pojo.Person;


public class Gk1ImperativeProgramming {
	

    public static void main(String[] args) {

        List<Person> persons = loadPersons();
        System.out.println("All Persons: " + persons);
        System.out.println("-------------------------------------------------");

        // Imperative Approach
        // To find only female persons
        List<Person> femalePerson = new ArrayList<Person>();
        for(Person person: persons){
            if(person.getGender().equals(Gender.FEMALE)){
                femalePerson.add(person);
            }
        }
        System.out.println("Female Persons using Imperative Approach: "+ femalePerson);
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
