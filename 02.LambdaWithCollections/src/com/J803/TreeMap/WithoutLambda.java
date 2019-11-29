package com.J803.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class WithoutLambda {

	public static void main(String[] args) {
		TreeMap<Integer, String> theTreeMap =new TreeMap<Integer, String>(new MyComparator());
		theTreeMap.put(1, "Gk1");
		theTreeMap.put(4, "Gk4");
		theTreeMap.put(5, "Gk5");
		theTreeMap.put(2, "Gk2");
		theTreeMap.put(3, "Gk3");
		
		
		System.out.println("The Result: "+theTreeMap);
		
	}

}


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}