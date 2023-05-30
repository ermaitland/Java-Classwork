package com.ellie.demo;

import com.ellie.exceptions.NegativeNumberException;

public class Calculator {
 /*
  * Divide two positive integers.
  * Requirements: 
  * If number 1 is negative : Negative number Exception 
  * If number 2 is negative : Negative number Exception
  * If number 1 is 0 : OK 
  * If number 2 is 0 : Exception
  */
	public int divide(int number1, int number2) throws NegativeNumberException {
		if(number1 >=0 && number2 >=0) {
			return number1/number2;
		}else {
			throw new NegativeNumberException("The number must be greater than 0");
		}
	}
}
