package com.ellie.shape;

public class Square extends Shape {

	private int area, perameter;
	
	public Square() {
		super(0);
	}
	

	@Override
	public void getArea() {
		area=getLength()*getLength();
		
	}

	@Override
	public void getPerameter() {
		perameter=getLength()+getLength()+getLength()+getLength();
		
	}

}
