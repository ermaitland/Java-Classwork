package com.ellie.demo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalcBigDecimal {

Scanner scanner=new Scanner(System.in);
		static BigDecimal invest;
		static BigDecimal newInvest;
		static int years;
		static BigDecimal interest;
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("How much do you want to invest?");
			invest=new BigDecimal(scanner.next());
			System.out.println("How long are you investing?");
			years=scanner.nextInt();
			System.out.println("And whats the annual interest rate?");
			BigDecimal annualInterest=new BigDecimal(scanner.next());
			BigDecimal quarters=new BigDecimal("4");
			interest=annualInterest.divide(quarters, 2, RoundingMode.HALF_UP);
			System.out.println(interest);
			growth();
			
		}
	public static void growth() {
		int finalInvest=0;
		int i;
		for(i=0;i<years;i++) {
			System.out.println("Year "+(i+1)+":");
			System.out.println("You begain with "+invest);
			newInvest=invest;
			for(int j=0;j<4;j++) {
				int mc= (1+(Integer.parseInt(interest.toString())/100));
				newInvest= newInvest.multiply(interest);
				finalInvest=Integer.parseInt(newInvest.toString())*mc;
			}
			System.out.println("New invest num "+finalInvest);
			BigDecimal yearEarn=new BigDecimal(newInvest.toString());
			yearEarn = yearEarn.subtract(invest);
			System.out.println("You earned :"+yearEarn);
			System.out.println("Your total was :"+newInvest);
			invest=newInvest;
		}

	}
}
