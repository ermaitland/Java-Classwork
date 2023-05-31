package com.ellie.demo;
import java.math.*;
public class SecondDemoBigDecimal {

	public static void main(String[] args) {
		BigDecimal first, second;
		// these are objects of big decimal class
		double intA=5689.356;
		double intB=2345.611;
		
		//Assigning value into BigDecimal object
		first = new BigDecimal("5689.356");
		second =new BigDecimal("2345.611");
		
		//Round up
		System.out.println(first.setScale(2, RoundingMode.HALF_UP));
		
		//Subtract - more exact .add(), .multiply(), .divide() and many more options for mathematical operators 
		//Will work to the number of digits specified, eg, as many as needed or in this case 2
		first=first.subtract(second);
		System.out.println(first.setScale(2, RoundingMode.HALF_UP));
		System.out.println(first.toString());
		
		//Check subtract
		intA=intA-intB;
		System.out.println(intA);
		
		
		
		//repeat with different numbers
		BigDecimal bdValue1,bdValue2;
		
		double inta = 56893.54000004;
		double intb = 56453.54660006;
		
		inta = inta + intb;
		
		System.out.println(inta);
		
		//Assigning value into BigDecimal object
		bdValue1 = new BigDecimal("56893.54000004");
		bdValue2 = new BigDecimal("56453.54660006");
		
		//Addition
		bdValue1 = bdValue1.add(bdValue2);
		
		System.out.println(bdValue1);
		// It already is a string representation so it will be the same value
		System.out.println(bdValue1.toString());
		
		//to compare; a.compareToMethod(b); -> with return <1 if smaller, 0 if same and >1 if greater than
		int a, b;
		a=4;
		b=7;
		if (a < b) {
			System.out.println("Bigger than");
		}         // For primitive double
		
//		if (A.compareTo(B) < 0)  {
//			
//		} 
		
		BigDecimal bg1, bg2;

	      bg1 = new BigDecimal("10");
	      bg2 = new BigDecimal("20");

	      //create int object
	      int res;

	      res = bg1.compareTo(bg2); // compare bg1 with bg2

	      String str1 = "Both values are equal ";
	      String str2 = "First Value is greater ";
	      String str3 = "Second value is greater";

	      if( res == 0 )
	         System.out.println( str1 );
	      else if( res == 1 )
	         System.out.println( str2 );
	      else if( res == -1 )
	         System.out.println( str3 );// For BigDecimal
//		Actually compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.

//		For equality we can also use:
	    BigDecimal A, B;
	    A=new BigDecimal("4.1");
		B=new BigDecimal("5.6");
		if (A.equals(B)) {
			System.out.println("They are equal");
		}else {
			System.out.println("Not equal");// A is equal to B
		}
	}

}
