package com.maitland.method;
/*
 * Create a class called Calculator which has 4 different methods add, diff, mul and div which
accepts two numbers as parameters. Overload the methods such that the parameters can be
of the following pattern.
1) Both are of int data type.
2. Both are of double data type.
3. First parameter is of int data type and second parameter is of double data type.
4. First parameter is of double data type and second parameter is of int data type.
Create an object to access these methods and invoke these methods with different type of numbers and display the result in the corresponding methods.
 */
public class Calculator {

	
public void add(int number1, int number2) {
	int ans=number1+number2;
	System.out.println(ans);
}
public void add(double number1, double number2) {
	double ans=number1+number2;
	System.out.println(ans);
}
public void add(int number1, double number2) {
	double ans=number1+number2;
	System.out.println(ans);
}
public void add(double number1, int number2) {
	double ans=number1+number2;
	System.out.println(ans);
}
public void minus(int number1, int number2) {
	int ans=number1-number2;
	System.out.println(ans);
}
public void minus(double number1, double number2) {
	double ans=number1-number2;
	System.out.println(ans);
}
public void minus(int number1, double number2) {
	double ans=number1-number2;
	System.out.println(ans);
}
public void minus(double number1, int number2) {
	double ans=number1*number2;
	System.out.println(ans);
}
public void mul(int number1, int number2) {
	int ans=number1*number2;
	System.out.println(ans);
}
public void mul(double number1, double number2) {
	double ans=number1*number2;
	System.out.println(ans);
}
public void mul(int number1, double number2) {
	double ans=number1*number2;
	System.out.println(ans);
}
public void mul(double number1, int number2) {
	double ans=number1*number2;
	System.out.println(ans);
}
public void div(int number1, int number2) {
	int ans=number1/number2;
	System.out.println(ans);
}
public void div(double number1, double number2) {
	double ans=number1/number2;
	System.out.println(ans);
}
public void div(int number1, double number2) {
	double ans=number1/number2;
	System.out.println(ans);
}
public void div(double number1, int number2) {
	double ans=number1/number2;
	System.out.println(ans);
}

public void action(int action, int number1, int number2, double doubleNumber1, double doubleNumber2) {
	switch(action) {
	case 1:
		add(number1, number2);
		add(doubleNumber1,doubleNumber2);
		add(doubleNumber1, number2);
		add(number1, doubleNumber2);
		break;
	case 2:
		minus(number1, number2);
		minus(doubleNumber1, doubleNumber2);
		minus(doubleNumber1, number2);
		minus(number1, doubleNumber2);
		break;
	case 3 :
		mul(number1, number2);
		mul(doubleNumber1, doubleNumber2);
		mul(doubleNumber1, number2);
		mul(number1, doubleNumber2);
		break;
	case 4 :
		div(number1, number2);
		div(doubleNumber1, doubleNumber2);
		div(doubleNumber1, number2);
		div(number1, doubleNumber2);
		break;
	default: 
		System.out.println("invalid");
		break;
	}
}
}
