package com.j802.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDate theDate = LocalDate.of(1993, 8, 2);
		LocalDate now = LocalDate.now();
		Period thePeriod = Period.between(theDate, now);
		System.out.printf("The Days: %d , The Months: %d, The Years: %d", thePeriod.getDays(), thePeriod.getMonths(),
				thePeriod.getYears());

	}

}
