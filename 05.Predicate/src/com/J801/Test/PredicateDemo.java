package com.J801.Test;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		PredicateDemo theDemo = new PredicateDemo();
		System.out.println(theDemo.testMethod(50));
		System.out.println(theDemo.testMethod(15));
		System.out.println(theDemo.testMethod(5));

		System.out.println("**************************************************");
		// New Way
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
