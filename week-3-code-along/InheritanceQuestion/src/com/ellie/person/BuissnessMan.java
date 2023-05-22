package com.ellie.person;

public class BuissnessMan extends PersonClass {
private String buisnessType;
private int annualTurnover;
public String getBuisnessType() {
	return buisnessType;
}
public void setBuisnessType(String buisnessType) {
	this.buisnessType = buisnessType;
}
public int getAnnualTurnover() {
	return annualTurnover;
}
public void setAnnualTurnover(int annualTurnover) {
	this.annualTurnover = annualTurnover;
}

public void inputBuisnesseData(int annualTurnover,String personName,String buisnessType, int personId) {
	inputPerson(personName, personId);
	this.annualTurnover=annualTurnover;
	this.buisnessType=buisnessType;
}

public void displayBuissnessMan() {
	displayPerson();
	System.out.println("Buissness : "+buisnessType);
	System.out.println("Annual Turnover : "+annualTurnover);
}
}
