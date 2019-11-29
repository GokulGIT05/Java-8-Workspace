package com.J801.Test;

import java.util.function.Predicate;

public class PredicateIsEqualStatic {

	public static void main(String[] args) {
		Predicate<String> thePredicate= Predicate.isEqual("Gokul");
		System.out.println(thePredicate.test("Gokul"));
		System.out.println(thePredicate.test("Gokul123"));
	}

}
	