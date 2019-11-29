package com.J802.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class WithoutLambda {
	
	public static void main(String args[]) {
		
		
		// If we not passed any parameter to treeset then it follows, DNSO.
		TreeSet<Integer> theTreeSet=new TreeSet<Integer>(new myComparator());
		theTreeSet.add(15);
		theTreeSet.add(35);
		theTreeSet.add(45);
		theTreeSet.add(25);
		theTreeSet.add(5);
		
		System.out.println("Sorting: "+theTreeSet);
		
	}

}

class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
}
