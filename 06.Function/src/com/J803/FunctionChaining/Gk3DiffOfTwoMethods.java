package com.J803.FunctionChaining;

import java.util.function.Function;

public class Gk3DiffOfTwoMethods {

	public static void main(String[] args) {

		Function<Integer, Integer> fn1 = i -> i + i;
		Function<Integer, Integer> fn2 = i -> i * i * i;

		// Difference between andThen and Compose( Only order will be reversed)
		// function1 output will be given as input to function2
		// andThen -> fn1 output will be given as input to the fn2
		Integer value1 = fn1.andThen(fn2).apply(2);
		System.out.println("AndThen: " + value1);
		// Step 1. 2+2 = 4, 4
		// Step 2. 4*4*4 = 64
		System.out.println("**************************************************");
		
		
		// andThen -> fn2 output will be given as input to the fn1
		// Vice-Versa
		Integer value2 = fn1.compose(fn2).apply(2);
		System.out.println("Compose: " + value2);

	}

}
