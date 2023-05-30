package com.ellie.demo;

public enum Coffee {
	SMALL(4, 5.6), LARGE(6, 7.9), OVERWHELMING(9, 8.5);
	// enter in the same order the constructor is made.
	private int size;
	private double price;
	
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private Coffee(int size, double price) {
		this.size = size;
		this.price = price;
	}	
	
	
}
