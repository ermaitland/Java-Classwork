package com.maitland.employee;

public class Employee {
private String empName, empDesgn, empLocation;
private int empId, empAge, empExpInYears;


//constructor same name as class, no return type; not even void, differenciated due to signature, doesn't need arguments.
public Employee(String empName) {
	this.empName=empName;
}
public Employee(String empName, int empAge) {
	this.empName=empName;
	this.empAge=empAge;
}
public Employee(String empName, int empId, int empAge) {
	this.empName=empName;
	this.empId=empId;
	this.empAge=empAge;
}
public Employee(String empName, int empId, String empDesgn) {
	this.empName=empName;
	this.empId=empId;
	this.empDesgn=empDesgn;
}
public Employee(String empName, int empId, int empAge, String empDesgn) {
	this.empName=empName;
	this.empId=empId;
	this.empAge=empAge;
	this.empDesgn=empDesgn;
}
public Employee(String empName, int empId, String empLocation, int empAge) {
	this.empName=empName;
	this.empId=empId;
	this.empAge=empAge;
	this.empLocation=empLocation;
}
public Employee(String empName, int empExpInYears, int empId, int empAge) {
	this.empName=empName;
	this.empId=empId;
	this.empAge=empAge;
	this.empExpInYears=empExpInYears;
}
public Employee(String empName,String empDesgn, int empExpInYears, int empId) {
	this.empName=empName;
	this.empId=empId;
	this.empDesgn=empDesgn;
	this.empExpInYears=empExpInYears;
}
public Employee(String empName, String empDesgn, String empLocation, int empExpInYears, int empId) {
	this.empName=empName;
	this.empId=empId;
	this.empDesgn=empDesgn;
	this.empExpInYears=empExpInYears;
	this.empLocation=empLocation;
}
public Employee(String empName, String empDesgn, String empLocation, int empExpInYears, int empId, int empAge) {
	this.empName=empName;
	this.empId=empId;
	this.empDesgn=empDesgn;
	this.empExpInYears=empExpInYears;
	this.empLocation=empLocation;
	this.empAge=empAge;
}

public void showEmployee() {
	System.out.println("Name : "+empName);
	System.out.println("Age : "+empAge);
	System.out.println("ID : "+empId);
	System.out.println("Location : "+empLocation);
	System.out.println("Designation : "+empDesgn);
	System.out.println("Years Experience : "+empExpInYears);
}
public Employee(int empId) {
	this.empId = empId;
}


}
