package com.j801.dateTime;

import java.time.LocalDateTime;

public class Gk2DateTimeExample1 {

	public static void main(String[] args) {

		// Represent both date and time.
		LocalDateTime thedate = LocalDateTime.now();
		System.out.println("The Date and Time: " + thedate);
		System.out.println();

		// Different Methods:
		// Date
		int day = thedate.getDayOfMonth();
		int month = thedate.getMonthValue();
		int year = thedate.getYear();

		System.out.print("Date: is: ");
		System.out.printf("%d-%d-%d", day, month, year);
		System.out.println();

		// Time
		int hr = thedate.getHour();
		int min = thedate.getMinute();
		int sec = thedate.getSecond();
		int nano = thedate.getNano();
		System.out.print("The Time is: ");
		System.out.printf("%d-%d-%d-%d", hr, min, sec, nano);

	}

}
