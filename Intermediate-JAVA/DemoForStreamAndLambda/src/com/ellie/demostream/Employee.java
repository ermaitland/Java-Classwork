package com.ellie.demostream;

public class Employee {

	private int empId;
	private String empName;
	private String empDep;
	private String empDesignation;
	private int basicSalary;
	public Employee(int empId, String empName, String empDep, String empDesignation, int basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
		this.empDesignation = empDesignation;
		this.basicSalary = basicSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDep=" + empDep + ", empDesignation="
				+ empDesignation + ", basicSalary=" + basicSalary + "]";
	}
	
	

}
