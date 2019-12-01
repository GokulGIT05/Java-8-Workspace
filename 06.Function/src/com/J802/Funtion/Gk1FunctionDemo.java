package com.J802.Funtion;

import java.util.function.Function;

public class Gk1FunctionDemo {

	public static void main(String[] args) {
		
		//  Function to return length of String
		Function<String, Integer> theFunction = s -> s.length();
		System.out.println("The  Lenght is: "+theFunction.apply("Gokul"));
		System.out.println("The  Lenght is: "+theFunction.apply("GokulSoft"));
		
		// Function to return the square.
		Function<Integer, Integer> theSquareFn= I -> I*I;
		System.out.println("The Square is: "+theSquareFn.apply(5));
	}

}
