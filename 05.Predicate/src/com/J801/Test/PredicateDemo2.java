package com.J801.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		//1. To Find length of string
		Predicate<String> thePredicate = (S) -> S.length() > 5;
		System.out.println(thePredicate.test("Gokul2"));

		//2. Check whether collection is empty or not.
		Predicate<Collection> thePredicateList = Al -> Al.isEmpty();

		ArrayList al = new ArrayList();
		al.add("Gokul");
		System.out.println(thePredicateList.test(al));
		
		ArrayList al1 = new ArrayList();
		System.out.println(thePredicateList.test(al1));
		
	}

}
