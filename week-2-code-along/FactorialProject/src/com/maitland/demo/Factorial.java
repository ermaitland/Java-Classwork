package com.maitland.demo;

//way to organise your code logically - also reducing merging conflicts

public class Factorial {

	private int number;
	private int factorial;
	
	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	private void calculateFactorial() {
		int i;
		factorial=number;
		for(i=number-1;i>0;i--) {
			factorial*=i;
		}
	}
	
}
