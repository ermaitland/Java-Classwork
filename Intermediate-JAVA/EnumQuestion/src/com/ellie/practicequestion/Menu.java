package com.ellie.practicequestion;

public enum Menu {
CHICKEN(false, 680, 12.5), PIZZA(true, 900, 9.6), PASTA(true, 700, 10.5), STEAK(false, 750, 14.5), LENTILS(true, 640, 9.8);
	private boolean veggie;
	private int calorie;
	private double price;
	public boolean isVeggie() {
		return veggie;
	}
	public void setVeggie(boolean veggie) {
		this.veggie = veggie;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private Menu(boolean veggie, int calorie, double price) {
		this.veggie = veggie;
		this.calorie = calorie;
		this.price = price;
	}
	
}
