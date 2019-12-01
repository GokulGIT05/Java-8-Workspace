package com.j803.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesException;

public class Gk1ZoneDemo {

	public static void main(String[] args) {

		ZoneId theCurrentZone = ZoneId.systemDefault();
		System.out.println(theCurrentZone);

		ZoneId theLA = ZoneId.of("America/Los_Angeles");
		System.out.println(theLA);
		ZonedDateTime theDT = ZonedDateTime.now(theLA);
		System.out.println("Date and Time in LA: " + theDT);

	}

}
