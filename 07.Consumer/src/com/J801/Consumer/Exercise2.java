package com.J801.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercise2 {

	// Program to display Student Information by using Predicate, Function and
	// Consumers
	public static void main(String[] args) {

		ArrayList<Student> theStudents = new ArrayList<Student>();
		populate(theStudents);

		// Predicate
		Predicate<Student> thePredicate = stud -> stud.marks > 60;

		// Function
		Function<Student, String> theFucnction = stud -> {
			if (stud.marks > 80) {
				return "A";
			} else if (stud.marks > 60) {
				return "B";
			} else
				return "E";
		};

		// Consumer:
		Consumer<Student> theConsumer = stud -> {
			System.out.println("The Student name: " + stud.name);
			System.out.println("The Marks: " + stud.marks);
			System.out.println("The Grade: " + theFucnction.apply(stud));
			System.out.println();
		};

		// Printing Values:
		for (Student std : theStudents) {
			if (thePredicate.test(std)) {
				theConsumer.accept(std);
			}
		}

	}

	private static void populate(ArrayList<Student> theStudents) {

		theStudents.add(new Student("Gk1", 50));
		theStudents.add(new Student("Gk2", 30));
		theStudents.add(new Student("Gk3", 60));
		theStudents.add(new Student("Gk4", 70));
		theStudents.add(new Student("Gk5", 80));
		theStudents.add(new Student("Gk6", 90));

	}

}
