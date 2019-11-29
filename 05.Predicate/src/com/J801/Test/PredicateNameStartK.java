package com.J801.Test;

import java.util.function.Predicate;

public class PredicateNameStartK {

	// Program to display names start with k or not.
	public static void main(String[] args) {

		String[] names = { "Gokul", "Rahul", "Kevin", "Mala", "Katrina" };

//		Predicate<String> thePredicate= names -> return names.startsWith("K") ;
		Predicate<String> startWithK = str -> str.charAt(0) == 'K';

		for (String s : names) {
			if (startWithK.test(s)) {
				System.out.println("The Name is: " + s);
			}
		}

	}

}
