package com.ellie.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ThirdDemo {
	
public static void main(String[] args) {
	BigDecimal obj=new BigDecimal("30.61");
	BigDecimal obj1=new BigDecimal("12.45");
	BigDecimal obj2=obj.divide(obj1,2, RoundingMode.HALF_UP);
	System.out.println(obj2.toString());
	
	BigDecimal obj3=new BigDecimal("30.61");
	BigDecimal obj4=new BigDecimal("12.45");
	BigDecimal obj5=obj3.multiply(obj4);
	System.out.println(obj5.setScale(2, RoundingMode.HALF_UP));
	
	BigDecimal obj6=new BigDecimal("30.61");
	BigDecimal obj7=new BigDecimal("12.45");
	BigDecimal obj8=obj6.subtract(obj7);
	System.out.println(obj8.setScale(2, RoundingMode.HALF_UP));
}
}

/* import java.math.BigDecimal;
import java.math.RoundingMode;
public class bigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal obj = new BigDecimal("32.37");
	
		BigDecimal obj1 = obj.setScale(1,RoundingMode.CEILING);
		System.out.println(obj1.toString());
		
		BigDecimal obj2 = new BigDecimal("45.37367");
		BigDecimal obj3 = obj2.divide(obj1, RoundingMode.HALF_UP);
		System.out.println(obj3.toString());
		
		BigDecimal obj4 = obj2.divide(obj1, 2, RoundingMode.HALF_UP);
		System.out.println(obj4.toString());
		
		//Create BigDecimal object
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
		bdValue1.toString();
		System.out.println(bdValue1);
 * 
 */
