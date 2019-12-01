package com.j802.streamsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gk1FilerMapExample {

	public static void main(String[] args) {
		ArrayList<String> theNames=new ArrayList<String>();
		theNames.add("Gokul1");
		theNames.add("Gokul12");
		theNames.add("Gokul123");
		theNames.add("Gokul1234");
		theNames.add("Gokul12345");
		System.out.println("The Original Values: "+theNames);
		
		// Streams
		// Filtering the Collection object by the lenght of the string.
		List<String> theResult=theNames.stream().filter(s -> s.length()>7).collect(Collectors.toList());
		System.out.println("Filter: "+theResult);
		System.out.println();
		
		// Map -> change the Every String in the object to UpperCase.
		List<String> theMapObj=theNames.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Map: "+theMapObj);
		System.out.println();
		
		// Count -> to return the number of objects present in collection after filtering.
		long theCount=theNames.stream().filter(s -> s.length()>7).count();
		System.out.println("Count: "+theCount);
		
	}

}
