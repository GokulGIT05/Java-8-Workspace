package com.J803.FunctionChaining;

import java.util.function.Function;

public class Gk1FnChainDemo {

	public static void main(String[] args) {
		String name = "muthumala";

		Function<String, String> toUpper = str -> str.toUpperCase();
		Function<String, String> toSubString = str -> str.substring(0, 4);

		System.out.println("Conversion to Uppercase: " + toUpper.apply(name));
		System.out.println("to Substring: " + toSubString.apply(name));

		// Function Chaining
		System.out.println("Function Chaining: toUpper: " + toUpper.andThen(toSubString).apply(name));
		System.out.println("Function Chaining: compose " + toUpper.compose(toSubString).apply(name));

	}

}
