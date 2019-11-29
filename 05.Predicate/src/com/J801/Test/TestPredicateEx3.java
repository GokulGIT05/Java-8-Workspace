package com.J801.Test;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicateEx3 {

	// Program for User Authentication by using Predicate
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Predicate<User> thePredicate = usr -> usr.userName.equals("Gokul") && usr.pwd.equals("Gk123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String UserName = sc.next();
		System.out.println("Enter Password: ");
		String passWord = sc.next();

		User theUser = new User(UserName, passWord);

		if (thePredicate.test(theUser)) {
			System.out.println("Succesfull Login");
		} else {
			System.out.println("Incorrect UserName and Password");
		}

	}

}
