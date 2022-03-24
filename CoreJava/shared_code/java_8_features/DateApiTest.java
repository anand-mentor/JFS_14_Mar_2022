package com.java8.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateApiTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now(); //dd,mm,yy
		System.out.println("LocalDate: " + localDate);
		
		localDate = LocalDate.of(2022, 1, 26);
		System.out.println("Custom LocalDate: " + localDate);
		System.out.println("Day: " + localDate.getDayOfMonth());
		System.out.println("Month: " + localDate.getMonthValue());
		System.out.println("Year: " + localDate.getYear());
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);
		
		localTime = LocalTime.of(10, 25, 35);
		System.out.println("Custom localTime: " + localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);
		
		localTime = LocalTime.of(6, 0);
		LocalTime localTime_2 = LocalTime.now();
		Duration duration = Duration.between(localTime, localTime_2);
		System.out.println("Duration: " + duration.getSeconds());
		
		localDate = LocalDate.of(2014, 3, 8);
		LocalDate localDate_2 = LocalDate.of(2014, 3, 19);
		Period period = Period.between(localDate, localDate_2);
		System.out.println("Period days: " + period.getDays());
		
		ZoneId zoneId = ZoneId.of("Australia/Melbourne");
		localTime = LocalTime.now(zoneId);
		System.out.println("Rome time: " + localTime);
		
	}

}









