package com.ellie.fileio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class MarshellingDemoClass {

	public static void main(String[] args) throws Exception {
		LinkedList<Employee> employees=new LinkedList<Employee>();
		 employees.add(new Employee(1, "AAA", "Executive", "Sales", 25000));
		 employees.add(new Employee(2, "BBB", "Junior", "Software", 27000));
		 employees.add(new Employee(3, "CCC", "Senior", "Sales", 21000));
		 employees.add(new Employee(4, "DDD", "Mid", "Sales", 20000));
		 employees.add(new Employee(5, "EEE", "Inters", "Software", 19000));
		 
		 FileWriter fileWriter=new FileWriter("EmployeeData");
		 PrintWriter printWriter=new PrintWriter(fileWriter);
		 
		 for(Employee employee:employees) {
			 String empSt=employee.getEmpId()+", "+employee.getEmpName()+", "+employee.getEmpDesignation()+", "+employee.getEmpDepartment()+", "+employee.getEmpSalary();	
			 printWriter.println(empSt);
	}
		 
		 printWriter.flush();
		 printWriter.close();
		 fileWriter.close();
	}

}
