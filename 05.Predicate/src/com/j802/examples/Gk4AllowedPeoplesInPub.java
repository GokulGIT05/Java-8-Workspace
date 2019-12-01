package com.j802.examples;

import java.util.function.Predicate;

import com.j802.examples.dto.SoftwareEngineer;

public class Gk4AllowedPeoplesInPub {

	// Program to Check Whether Software Engineer is allowed into Pub or not
	public static void main(String[] args) {
		
		SoftwareEngineer[] engineers= {	new SoftwareEngineer("Gokul", 25, true),
										new SoftwareEngineer("Rahul", 17, false),
										new SoftwareEngineer("Chetan", 25, true),
										new SoftwareEngineer("Prasanna", 25, false),
										new SoftwareEngineer("Rajesh", 25, true)
										};
		
		Predicate<SoftwareEngineer> thePredicate = er -> er.age > 18 && er.isCouple;

		for (SoftwareEngineer sEng : engineers) {
			if (thePredicate.test(sEng)) {
				System.out.println("The Engineer " + sEng + " is allowed inside pub");
			} else {
				System.out.println("The Engineer " + sEng + " is not allowed inside pub");
			}
		}

	}

}
