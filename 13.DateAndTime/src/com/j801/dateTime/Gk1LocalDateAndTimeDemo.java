package com.j801.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gk1LocalDateAndTimeDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("The Current System date: " + date);

		LocalTime time = LocalTime.now();
		System.out.println("The Current System Time: " + time);
		System.out.println();

		// Own format for date:
		LocalDate owndateFmt = LocalDate.now();
		int dd = owndateFmt.getDayOfMonth();
		int mm = owndateFmt.getMonthValue();
		int yy = owndateFmt.getYear();
		System.out.print("Customizzed date format: ");
		System.out.printf("%d-%d-%d", dd, mm, yy);
		System.out.println();
		
		// Own time format:
		LocalTime owntimefmt=LocalTime.now();
		int hr=owntimefmt.getHour();
		int min=owntimefmt.getMinute();
		int sec=owntimefmt.getSecond();
		int nano=owntimefmt.getNano();
		System.out.print("Customizzed Time format: ");
		System.out.printf("%d:%d:%d",hr,min,sec);
		System.out.println();
		
	
	}

}
