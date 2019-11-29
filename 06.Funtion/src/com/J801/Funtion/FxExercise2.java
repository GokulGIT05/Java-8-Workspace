package com.J801.Funtion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FxExercise2 {

	// Program to find Student Grade by using Function
	public static void main(String[] args) {

		ArrayList<Student> theAl = new ArrayList<Student>();

		populate(theAl);

		System.out.println("The List of Students: " + theAl);

		Function<Student, String> theFunction = LocalVarAL -> {

			int marks = LocalVarAL.marks;

			if (marks >= 80) {
				return "A[Distinction]";
			} else if (marks >= 60)
				return "B[First Class]";
			else
				return "D[Average]";
		};

		// To find student grade for all the students.
		for (Student theStud : theAl) {
			System.out.println("The Student " + theStud.name + " grade is: " + theFunction.apply(theStud));
		}
		
		System.out.println();
		
		// To Find the student who are having more than 80.
		Predicate<Student> thePredicate = theS ->
		{
			int marks = theS.marks;
			if(marks > 80) {
				return true;
			}else {
				return false;
			}
				
		};
		
		
		Predicate<Student> thePredicate1 = theS1 -> theS1.marks > 70;
		
		System.out.println("The Students who are all got more than 80 marks:");
		for(Student theStud: theAl) {			
			if(thePredicate1.test(theStud)) {
				System.out.println("The Name of the Student is:"+theStud.name );
				
			}
		}
		
		

	}

	private static void populate(ArrayList<Student> theAl) {

		theAl.add(new Student("Gk1", 30));
		theAl.add(new Student("Gk2", 50));
		theAl.add(new Student("Gk3", 70));
		theAl.add(new Student("Gk4", 90));
		theAl.add(new Student("Gk5", 85));

	}

}
