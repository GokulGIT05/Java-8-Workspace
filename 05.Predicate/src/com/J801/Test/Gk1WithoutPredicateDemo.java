package com.J801.Test;

import java.util.function.Predicate;

public class Gk1WithoutPredicateDemo {

	public static void main(String[] args) {

		Gk1WithoutPredicateDemo theDemo = new Gk1WithoutPredicateDemo();
		System.out.println(theDemo.testMethod(50));
		System.out.println(theDemo.testMethod(15));
		System.out.println(theDemo.testMethod(5));

		System.out.println("**************************************************");

		// New Way Using Lambda Expressions
		Predicate<Integer> thePredicate = I -> I > 10;

		System.out.println(thePredicate.test(50));
		System.out.println(thePredicate.test(15));
		System.out.println(thePredicate.test(5));

	}

	// Old Way
	public boolean testMethod(Integer I) {
		if (I > 10) {
			return true;
		} else
			return false;
	}
}
