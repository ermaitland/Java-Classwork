package com.ellie.employee.persistance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.ellie.employee.dto.Employee;

public class EmployeeDataAccessImpl implements EmployeeDataAccess {

	@Override
	public boolean writeRecords(LinkedList<Employee> employees) throws Exception {
		FileWriter fileWriter=new FileWriter("EmployeeData");
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(Employee employee:employees) {
			String empStr=employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpDesignation()+","+employee.getEmpDepartment()+","+employee.getEmpSalary();
			
			printWriter.println(empStr);
		}
		
		printWriter.flush();
		
		printWriter.close();

		fileWriter.close();
		return true;
	}


	public static LinkedList<Employee> readRecords() throws Exception{
		LinkedList<Employee> employees=new LinkedList<Employee>();
		
		FileReader fileReader = new FileReader("EmployeeData");

		// read the content from buffer
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		Scanner scanner = new Scanner(bufferedReader);
		while (scanner.hasNext()) {
			String currentLine = scanner.nextLine();
			String values[]=currentLine.split(",");
			
			Employee employee=new Employee(Integer.parseInt(values[0]), values[1], values[2], values[3],Double.parseDouble(values[4]));
			
			employees.add(employee);
		}
		fileReader.close();
		bufferedReader.close();
		
		return employees;
	}

}
