package com.J801.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithLambda {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(1);
		al.add(54);
		al.add(2);
		al.add(25);

		System.out.println("Before Sorting: " + al);
		// Lambda Expression- Descending Order
		Comparator<Integer> compRef = (I1, I2) -> I2.compareTo(I1);
		Collections.sort(al, compRef);
		System.out.println("Descending Order: " + al);

	}

}
