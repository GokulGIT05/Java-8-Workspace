package com.J801.Test;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50, 60, 5, 4, 3, 2, 1 };

		// Declaring Predicate
		// Check whether the given number is greater than 30 or not.
		Predicate<Integer> thePredicate = I -> I > 30;
		// Check Whether the given number is even or not.
		Predicate<Integer> thePredicateCndn = E -> (E % 2 == 0);

		System.out.println("The Number is greater than 30 or not: ");
		testNum(thePredicate, x);

		System.out.println("The Number is even or not: ");
		testNum(thePredicateCndn, x);

		// Negate means it gives opposite result.
		System.out.println("The Number is not greater than 30 or not:  Negate/Opposite");
		testNum(thePredicate.negate(), x);

		System.out.println("The Number is not even or not: ");
		testNum(thePredicateCndn.negate(), x);

		System.out.println(
				"Using And default Methods- The Number is greater than 30 or not: AND()  The Number is even or not:");
		testNum(thePredicate.and(thePredicateCndn), x);

		System.out.println(
				"Using OR default Methods- The Number is greater than 30 or not: OR()  The Number is even or not:");
		testNum(thePredicate.or(thePredicateCndn), x);
	}

	public static void testNum(Predicate<Integer> p, int[] x) {
		for (Integer i1 : x) {
			if (p.test(i1)) {
				System.out.println("The Given numbers is " + i1);
			}
		}

	}

}
