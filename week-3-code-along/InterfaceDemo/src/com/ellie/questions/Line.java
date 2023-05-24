package com.ellie.questions;

public class Line implements Drawable {

	private String color;
	private int thickness;
	
	public Line(String color, int thickness) {
		super();
		this.color=color;
		this.thickness=thickness;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	@Override
	public void drawingColor() {
		System.out.println("Draw in "+color);

	}

	@Override
	public void thickness() {
		System.out.println(thickness);

	}

}
