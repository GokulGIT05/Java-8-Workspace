package com.j802.period;

import java.time.Year;
import java.util.Scanner;

public class Exercise1 {

	// To find the Leap year or not.
	public static void main(String[] args) {

		Scanner theSc = new Scanner(System.in);
		System.out.println("Enter the year to find leap year or not: ");
		int yr = theSc.nextInt();

		Year theYear = Year.of(yr);

		if (theYear.isLeap()) {
			System.out.println("The Year is leap year.");
		} else
			System.out.println("The year is not leap year");

	}

}
