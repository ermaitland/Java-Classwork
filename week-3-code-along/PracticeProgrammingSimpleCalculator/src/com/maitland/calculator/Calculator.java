package com.maitland.calculator;

public class Calculator {
private double number1, number2;
private double answer;


public Calculator(double number1, double number2) {
	super();
	this.number1 = number1;
	this.number2 = number2;
}
public void setNumber1(int number1) {
	this.number1 = number1;
}
public void setNumber2(int number2) {
	this.number2 = number2;
}
public double getAnswer() {
	return answer;
}

public void add(double number1, double number2) {
	answer=number1+number2;
	System.out.println(answer);
}
public void minus(double number1, double number2) {
	answer=number1-number2;
	System.out.println(answer);
}
public void mul(double number1, double number2) {
	answer=number1*number2;
	System.out.println(answer);
}
public void div(double number1, double number2) {
	answer=number1/number2;
	System.out.println(answer);
}



}
