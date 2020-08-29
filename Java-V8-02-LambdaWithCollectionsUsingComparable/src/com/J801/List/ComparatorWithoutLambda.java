package com.J801.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithoutLambda {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(1);
		al.add(54);
		al.add(2);
		al.add(25);

		System.out.println("Before Sorting: " + al);
		Collections.sort(al, new MyComparator());
		System.out.println("After Sorting: " + al);

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}