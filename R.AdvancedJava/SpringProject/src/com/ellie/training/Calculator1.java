package com.ellie.training;

import com.ellie.demo.Operator;
import com.ellie.demo.Product;

public class Calculator1 {
	// private variables are the ones the class is dependent on
	// get to them with help of constructor/getter/setter
	private Operator operator;
	
	
	
	public Calculator1(Operator operator) {
		super();
		this.operator = operator;
	}



	public void showResult(int number1, int number2) {
		long result = operator.operate(number1, number2);
		System.out.println("Result is "+result);
	}
}
