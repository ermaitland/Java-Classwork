package com.ellie.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		localDate=LocalDate.parse("23-04-2023", DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		System.out.println(localDate);
	}

}
