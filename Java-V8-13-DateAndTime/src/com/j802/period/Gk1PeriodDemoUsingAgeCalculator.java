package com.j802.period;

import java.time.LocalDate;
import java.time.Period;

public class Gk1PeriodDemoUsingAgeCalculator {

	public static void main(String[] args) {

		LocalDate theDate = LocalDate.of(1993, 8, 2);
		LocalDate now = LocalDate.now();
		Period thePeriod = Period.between(theDate, now);
		System.out.printf("My Age: The Year: %d , The Months: %d, The Days: %d", thePeriod.getYears(), thePeriod.getMonths(),
				thePeriod.getDays());

	}

}
