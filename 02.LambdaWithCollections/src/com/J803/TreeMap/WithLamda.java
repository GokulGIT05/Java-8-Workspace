package com.J803.TreeMap;

import java.util.TreeMap;

public class WithLamda {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> theTreeMap =new TreeMap<Integer, String>((Int1, Int2) -> Int2.compareTo(Int1) );
		theTreeMap.put(1, "Gk1");
		theTreeMap.put(4, "Gk4");
		theTreeMap.put(5, "Gk5");
		theTreeMap.put(2, "Gk2");
		theTreeMap.put(3, "Gk3");
		
		
		System.out.println("The Result: "+theTreeMap);
	}

}
