package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gk2SortedMethodDemo {

	public static void main(String[] args) {

		ArrayList<Integer> theNos = new ArrayList<Integer>();
		theNos.add(10);
		theNos.add(50);
		theNos.add(1);
		theNos.add(3);
		theNos.add(7);
		System.out.println("The Original Values: "+theNos);
		System.out.println();
		
		// Streams: SortedMethod - DNSO (Ascending Order)
		List<Integer> theResult=theNos.stream().sorted().collect(Collectors.toList());
		System.out.println("After DNSO: "+theResult);
		System.out.println();
		
		// Customized Sorting Order (Descending Order)
		// Instead of Comparator Interfaces, using directly in sorted Method
		List<Integer> theCustomSort=theNos.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Customised Sorting Order: "+theCustomSort);

	}

}
