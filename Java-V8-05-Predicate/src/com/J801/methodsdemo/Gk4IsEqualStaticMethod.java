package com.J801.methodsdemo;

import java.util.function.Predicate;

public class Gk4IsEqualStaticMethod {

	public static void main(String[] args) {
		Predicate<String> thePredicate= Predicate.isEqual("Gokul");
		System.out.println(thePredicate.test("Gokul"));
		System.out.println(thePredicate.test("Gokul123"));
	}

}
	