package com.maitland.electricity;

public class Electricity {
private int numberOfUnits;
private double price;

public void setNumber(int numberOfUnits) {
	this.numberOfUnits = numberOfUnits;
}
public double getPrice() {
	overallPrice();
	return price;
}

public void overallPrice(){

if(numberOfUnits <=50) {
	price=numberOfUnits*0.5;
}else if(numberOfUnits>50 && numberOfUnits<=150) {
	price=50*0.5;
	price=price+(numberOfUnits-50)*0.75;
}else if(numberOfUnits>150 && numberOfUnits<=250) {
	price=50*0.5;
	price=price+(100*0.75);
	price=price+(numberOfUnits-150)*1.20;
}else if(numberOfUnits>250) {
	price=50*0.5;
	price=price+(100*0.75);
	price=price+(100*1.20);
	price=price+(numberOfUnits-250)*1.50;
}
price=(price/100)*120;
}
}
