package com.elle.generics;
// created a POJO - baseclass is object, all classes are child classes of object
public class Person {
	
private int personId;
private String personName;

public Person() {
	
}

public Person(int personId, String personName) {
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

@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + "]";
}



}
