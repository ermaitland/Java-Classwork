package com.ellie.demo;

public class StaticVariableTwo {
	private int value1;
	private static int value2;
	
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public static int getValue2() {
		return value2;
	}
	public static void setValue2(int value2) {
		StaticVariableTwo.value2 = value2;
	}
	


}
