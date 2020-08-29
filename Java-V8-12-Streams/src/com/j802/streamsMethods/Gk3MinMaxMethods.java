package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gk3MinMaxMethods {

	public static void main(String[] args) {

		ArrayList<Integer> theNos = new ArrayList<Integer>();
		theNos.add(10);
		theNos.add(50);
		theNos.add(1);
		theNos.add(3);
		theNos.add(7);
		System.out.println("The Original Values: "+theNos);
		System.out.println();
		
		// Streams: Min and Max Values: for Compulsory is should be sorted.
		// Min values
		Integer theMin=theNos.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("The Minimum values is: "+theMin);
		System.out.println();
	
		// Max Values:
		Integer theMax=theNos.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("The Maximum values is: "+theMax);

	}

}
