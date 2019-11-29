package com.J802.FunctionChaining;

import java.util.function.Function;

public class DemoStatic {
	
	// Function.identity() Demo
	public static void main(String[] args) {
		Function<String, String> fn1=Function.identity();
		System.out.println(fn1.apply("Gokul"));
	}

}
