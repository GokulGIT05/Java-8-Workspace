package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

	// toArray Method
	public static void main(String[] args) {
		
		ArrayList<Integer> theNos=new ArrayList<Integer>();
		theNos.add(10);
		theNos.add(20);
		theNos.add(30);
		theNos.add(40);
		theNos.add(50);
		
		System.out.println("The Original Values: "+theNos);
		System.out.println();
		
		//Streams toArray
		Integer[] toArray=theNos.stream().toArray(Integer[]::new);
		
		for(Integer theInt: toArray) {
			System.out.println(theInt);
		}
		

	}

}
