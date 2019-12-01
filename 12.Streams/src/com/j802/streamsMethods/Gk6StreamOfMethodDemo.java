package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Gk6StreamOfMethodDemo {

	// Stream.of Method
	public static void main(String[] args) {
		
		// Normal Values
		Stream<Integer> theStream = Stream.of(1,2,3,4,5,6,7,8,9);
		theStream.forEach(System.out::println);
		System.out.println();
		
		// Array Values:
		Double[] dble= {10.0,11.0,12.0,13.0,14.0};
		Stream<Double> theArray=Stream.of(dble);
		theArray.forEach(System.out::println);
	}

}
