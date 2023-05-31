package com.ellie.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class BirthDAYPracticeProgramming {

	public static void main(String[] args) {
		System.out.println("Please enter your birthday: dd/mm/yyy");
		Scanner scanner=new Scanner(System.in);
		String birthday=scanner.next();
		LocalDate localDate;
		localDate=LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String formatted = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println("You were born on : "+formatted);
		LocalDate today= LocalDate.now();
		Period diff = today.until(localDate);
		System.out.println("Todays date is "+today+", so there is only "+diff+" days between today and your birthday!");
		

	}

}
