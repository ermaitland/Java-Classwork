package com.ellie.person;

public class PersonClass {
private int personId;
private String personName;


public PersonClass(int personId, String personName) {
	super();
	this.personId = personId;
	this.personName = personName;
}
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public void inputPerson(String personName, int personId) {
	this.personId=personId;
	this.personName=personName;
}
public void displayPerson() {
	System.out.println("Name : "+personName);
	System.out.println("ID : "+personId);
}

}
