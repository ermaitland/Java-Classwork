package com.maitland.numberLength;

public class LengthOfNumber {

	private int number, length;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLength() {
		getTheLengthOfNumber();
		return length;
	}

	public void getTheLengthOfNumber() {
		length=0;
		int i;
		for(i=number;i!=0;i=i/10) {
			length++;
		}
	}
	
	
}
