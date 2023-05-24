package com.ellie.shape;

abstract public class Shape {

	private int length;

	public Shape(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	abstract public void getArea();
	abstract public void getPerameter();

}
