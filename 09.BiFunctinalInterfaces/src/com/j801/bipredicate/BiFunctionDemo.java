package com.j801.bipredicate;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> theBiFn = (a, b) -> a * b;
		System.out.println("The Result is: " + theBiFn.apply(5, 5));
		System.out.println("The Result is: " + theBiFn.apply(5, 10));
	}

}
