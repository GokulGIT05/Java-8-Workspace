package com.j801.primitivefi;

import java.util.function.IntPredicate;

public class Gk1PredicateInt {

	public static void main(String[] args) {

		IntPredicate theInt = i -> i % 2 == 0;
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 90, 3 };
		for (int i = 0; i < values.length; i++) {
			if (theInt.test(values[i])) {
				System.out.println("The Even numbers are: " + values[i]);
			}
		}

	}

}
