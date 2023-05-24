package com.ellie.questions;

public class Circle implements Drawable, Fillable {
	private String color, color2;
	private int thickness;
	
	public Circle(String color, String color2, int thickness) {
		super();
		this.color=color;
		this.thickness=thickness;
		this.color2=color2;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	@Override
	public void fillingColor() {
		System.out.println("Fill in "+color);

	}

	@Override
	public void size() {
		System.out.println("Size : Big");

	}

	@Override
	public void drawingColor() {
		System.out.println("Draw in "+ color2);

	}

	@Override
	public void thickness() {
		System.out.println(thickness);

	}

}
