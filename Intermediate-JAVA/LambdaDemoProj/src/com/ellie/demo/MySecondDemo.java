package com.ellie.demo;

@FunctionalInterface
interface Calculate {
	public long calculate(int number1, int number2);
}

public class MySecondDemo {
// if one statement, and the statement must be a return type then you don't need to state the "return"
	public static void main(String[] args) {
		Calculate sum=(number1,number2)->number1+number2;
		System.out.println(sum.calculate(34, 89));
	}

}
