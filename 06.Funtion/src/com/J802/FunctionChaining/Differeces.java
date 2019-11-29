package com.J802.FunctionChaining;

import java.util.function.Function;

public class Differeces {

	public static void main(String[] args) {
		
		Function<Integer, Integer> fn1= i -> i+i;
		Function<Integer, Integer> fn2= i -> i*i*i;
		
		// Difference between andThen and Compose( Only order will be reversed) function1 output will be given as input to function2
		// andThen -> fn1 output will be given as input to the fn2
		System.out.println("AndThen: "+fn1.andThen(fn2).apply(2));
		// andThen -> fn2 output will be given as input to the fn1
		System.out.println("Compose: "+fn1.compose(fn2).apply(2));
		
	}

}
