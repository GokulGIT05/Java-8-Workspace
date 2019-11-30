package com.J802.TreeSet;

import java.util.TreeSet;

public class WithLambda {

	public static void main(String[] args) {
		TreeSet<Integer> theTreeSet=new TreeSet<Integer>((I1,I2) -> I2.compareTo(I1));
		
		theTreeSet.add(15);
		theTreeSet.add(35);
		theTreeSet.add(45);
		theTreeSet.add(25);
		theTreeSet.add(5);
		
		System.out.println("Sorting: "+theTreeSet);
	}

}
