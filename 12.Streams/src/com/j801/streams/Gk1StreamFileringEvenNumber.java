package com.j801.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Gk1StreamFileringEvenNumber {

	// To filter even number from the list and add those even numbers to the
	// separate list.
	public static void main(String[] args) {

		ArrayList<Integer> theNos = new ArrayList<Integer>();
		populate(theNos);
		System.out.println("The  Original values: " + theNos);

		// Java 1.7 Version coding
		System.out.println("Old Version Approach");
		ArrayList<Integer> evenJava7 = new ArrayList<Integer>();
		for (Integer value : theNos) {
			if (value % 2 == 0) {
				evenJava7.add(value);
			}
		}
		System.out.println("Java 7 Version: Even No's are: " + evenJava7);
		System.out.println("***********************************************************");

		// Java 8 Approach
		System.out.println("Java 8 Approach");
		ArrayList<Integer> evenJava8 = new ArrayList<Integer>();
		evenJava8 = (ArrayList<Integer>) theNos.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(evenJava8);

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
