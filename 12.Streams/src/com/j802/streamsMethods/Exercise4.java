package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Streams: ForEach Method
		ArrayList<String> theLetters=new ArrayList<String>();
		theLetters.add("A");theLetters.add("AA");theLetters.add("AAA");
		// Using Lambda
		theLetters.stream().forEach(s -> System.out.println(s));
		System.out.println();
		// Using Method  Reference
		theLetters.stream().forEach(System.out::println);
		

	}

}
