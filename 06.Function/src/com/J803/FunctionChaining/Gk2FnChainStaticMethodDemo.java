package com.J803.FunctionChaining;

import java.util.function.Function;

public class Gk2FnChainStaticMethodDemo {
	
	// Function.identity() Demo
	public static void main(String[] args) {
		Function<String, String> fn1=Function.identity();
		System.out.println(fn1.apply("Gokul"));
	}

}
