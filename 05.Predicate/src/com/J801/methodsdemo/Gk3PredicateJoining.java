package com.J801.methodsdemo;

import java.util.function.Predicate;

public class Gk3PredicateJoining {

	public static void main(String[] args) {
		int[] inputValues = { 1, 2, 3, 4, 5 };

		// Declaring Predicate
		// boolean test(T t);
		// Check whether the given number is greater than 30 or not.
		Predicate<Integer> isGreaterThan30 = I -> I > 3;
		// Check Whether the given number is even or not.
		Predicate<Integer> isEvenNumber = E -> (E % 2 == 0);

		System.out.println("The Number is greater than 3 or not: ");
		testNum(isGreaterThan30, inputValues);

		System.out.println("The Number is even or not: ");
		testNum(isEvenNumber, inputValues);
		System.out.println("****************************");
		System.out.println("Predicate Methods: ");
		System.out.println("1.  default Predicate<T> negate()");
		// Negate means it gives opposite result.
		System.out.println("The Number is not greater than 3 or not:  Negate/Opposite");
		testNum(isGreaterThan30.negate(), inputValues);

		System.out.println("The Number is not even or not: ");
		testNum(isEvenNumber.negate(), inputValues);
		System.out.println("****************************");

		System.out.println("2. default Predicate<T> and(Predicate<? super T> other) {");
		System.out.println(
				"Using And default Methods- The Number is greater than 3 or not: AND()  The Number is even or not:");
		testNum(isGreaterThan30.and(isEvenNumber), inputValues);
		System.out.println("****************************");
		System.out.println("3.  default Predicate<T> or(Predicate<? super T> other)");
		System.out.println(
				"Using OR default Methods- The Number is greater than 3 or not: OR()  The Number is even or not:");
		testNum(isGreaterThan30.or(isEvenNumber), inputValues);
	}

	public static void testNum(Predicate<Integer> p, int[] x) {
		for (Integer i1 : x) {
			if (p.test(i1)) {
				System.out.println("The Given numbers is " + i1);
			}
		}
	}

}
