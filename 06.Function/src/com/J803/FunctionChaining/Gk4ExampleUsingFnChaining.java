package com.J803.FunctionChaining;

import java.util.Scanner;
import java.util.function.Function;

public class Gk4ExampleUsingFnChaining {

	// Demo Program for Function Chaining.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String userName = sc.next();
		System.out.println("Enter Password: ");
		String passWord = sc.next();

		Function<String, String> f1 = s -> s.substring(0, 4);
		Function<String, String> f2 = s -> s.toLowerCase();

		if (f1.andThen(f2).apply(userName).equals("goku") & passWord.equals("gk123")) {
			System.out.println("User Authenicated");
		} else
			System.out.println("User Not Authenticated");

	}

}
