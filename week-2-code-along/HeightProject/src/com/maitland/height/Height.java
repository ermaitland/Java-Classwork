package com.maitland.height;

public class Height {
	private int feet, inches;

	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public void inputHeight(int feet, int inches) {
		this.feet=feet;
		this.inches=inches;
	}
	public void displayHeight() {
		int i;
		int extraFeet=0;	
	if(inches>12) {
		for(i=inches;i>12;i=i-12) {
			inches=inches-12;
			extraFeet++;
		}		}
		feet=feet+extraFeet;
		System.out.println(feet+" feet and "+inches+" inches");
	}
	public void complexSum(Height h1, Height h2) {
		this.inches=h1.inches+h2.inches;
		this.feet=h1.feet+h2.feet;
	}
}
