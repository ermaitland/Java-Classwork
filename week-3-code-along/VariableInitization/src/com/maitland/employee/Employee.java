package com.maitland.employee;
/*Exercise: Create a class called employee with the following data members
empName
empId
empAge
empDesgn
empLocation
empExpInYrs

All these data members should be initialized using constructors. Use constructor overloading and demonstrate by creating different employee objects with
1.Employee  name alone -
2. Employee name and id -
3. Employee name, id and age -
4. Employee name, id and designation -
5. Employee name, id, age and designation -
6. Employee name, id, age and location - 
7. Employee name, id, age and experience -
8. Employee name, id, designation and experience - 
9. Employee name, id, designation, location and experience -
10. Employee name, id, age, designation, location and experience
*/
public class Employee {
private String empName, empDesgn, empLocation;
private int empId, empAge, empExpInYears;

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
}
