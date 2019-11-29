package com.J801.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateEx2 {

	// To Remove empty list and null values from the given list.
	public static void main(String[] args) {
		String names[]=  { "Gokul", "Rahul",null, "Kevin","", "Mala", "Katrina","" };
		
		
		Predicate<String> thePredicate= Sname -> Sname != null && Sname.length() != 0;
		
		ArrayList<String> theAL=new ArrayList<String>();
		
		
		for(String str:names) {
			if(thePredicate.test(str)) {
				theAL.add(str);
			}
		}
		
		System.out.println("The Result Array List is: "+theAL);
		
		
	}

}
