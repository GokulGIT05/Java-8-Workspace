package com.J801.supplier;

import java.util.function.Supplier;

public class Gk4ToGetRandomPasswordEx3 {

	// To Generate random password
	// 1. Password should be 8 characters
	// 2. Position 2,4,6,8 should be digits
	// 3. Position 1,3,5,7 Should be Alphabets and !@#$
	public static void main(String[] args) {

		Supplier<String> theMainSupplier = () -> {

			String pwd = "";

			// Random Digit
			Supplier<Integer> theDigit = () -> (int) (Math.random() * 10);

			// Random Character
			Supplier<Character> theChar = () -> {
				String str = "ABCDERFGHIJKLMNOPQRSTUVVWXYZ!@#$";
				return (str.charAt((int) (Math.random() * 27)));
			};

			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + theDigit.get();
				} else {
					pwd = pwd + theChar.get();
				}
			}

			return pwd;
		};

		System.out.println((int) (Math.random() * 27)); // It will get number between 0 to 26
		System.out.println("The Random Password is: " + theMainSupplier.get());
		System.out.println("The Random Password is: " + theMainSupplier.get());
		System.out.println("The Random Password is: " + theMainSupplier.get());

	}

}
