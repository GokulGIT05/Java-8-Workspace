package com.J802.Funtion;

import java.util.function.Function;

public class Gk2FunctionExample1 {

	// Program to remove spaces present in the given String by using Function
	public static void main(String[] args) {
		
		String inputString = "Gokul Software Solutions Tirunelveli";

		Function<String, String> fn = strReplace -> strReplace.replaceAll(" ", "");

		System.out.println("After Removing Spaces in String: " + fn.apply(inputString));

		// To Count number of spaces in string.
		Function<String, Integer> fnCount = s1 -> s1.length() - s1.replaceAll(" ", "").length();
		System.out.println("Number of Spaces: " + fnCount.apply(inputString));
	}
}
