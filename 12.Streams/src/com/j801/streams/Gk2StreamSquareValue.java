package com.j801.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Gk2StreamSquareValue {

	// To Double the value of one list and stored it into another list.
	public static void main(String[] args) {
		ArrayList<Integer> theNos = new ArrayList<Integer>();
		populate(theNos);
		System.out.println("The  Original values: " + theNos);

		// Java 1.7 Version coding
		ArrayList<Integer> evenJava7 = new ArrayList<Integer>();
		for (Integer value : theNos) {

			evenJava7.add(value * 2);

		}
		System.out.println("Java 7 Version: 2 Times value of orig: " + evenJava7);
		System.out.println();

		// Java 8 Approach
		System.out.println("Java 8 Approach");
		ArrayList<Integer> evenJava8 = new ArrayList<Integer>();
		evenJava8 = (ArrayList<Integer>) theNos.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println("Java 8: 2 times the orig values: " + evenJava8);

	}

	private static void populate(ArrayList<Integer> theNos) {

		theNos.add(5);
		theNos.add(25);
		theNos.add(30);
		theNos.add(10);
		theNos.add(40);
		theNos.add(50);

	}

}
