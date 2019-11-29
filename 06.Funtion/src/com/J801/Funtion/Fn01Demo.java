package com.J801.Funtion;

import java.util.function.Function;

public class Fn01Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Function to return length of String
		Function<String, Integer> theFunction = s -> s.length();
		System.out.println("The  Lenght is: "+theFunction.apply("Gokul"));
		System.out.println("The  Lenght is: "+theFunction.apply("GokulSoft"));
		
		// Function to return the square.
		Function<Integer, Integer> theSquareFn= I -> I*I;
		System.out.println("The Square is: "+theSquareFn.apply(5));
	}

}
