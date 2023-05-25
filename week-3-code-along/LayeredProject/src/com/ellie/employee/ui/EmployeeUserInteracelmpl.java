package com.ellie.employee.ui;

import java.util.LinkedList;
import java.util.Scanner;

import com.ellie.employee.dto.Employee;
import com.ellie.employee.service.EmployeeBussienssLogicImpl;

public class EmployeeUserInteracelmpl implements EmployeeUserInterface {

	private EmployeeBussienssLogicImpl bussinessLogic=new EmployeeBussienssLogicImpl();
	

	@Override
	public void showMenu() {
		System.out.println("1. List all employees");
		System.out.println("2. Add new employees");
		System.out.println("3. Delete exisiting employees");
		System.out.println("4. Search for existing employee");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		
		switch(choice) {
		case 1: 
			LinkedList<Employee> employees=bussinessLogic.getAllEmployees();
			for(Employee employee:employees) {
				System.out.println(employee);
			}
			break;
		case 2: 
			Employee employee=new Employee();
			System.out.println("Enter  Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Enter  Employee Name : ");
			employee.setEmpName(scanner.next());
			System.out.println("Enter  Employee Designation : ");
			employee.setEmpDesignation(scanner.next());
			System.out.println("Enter  Employee Department : ");
			employee.setEmpDepartment(scanner.next());
			System.out.println("Enter  Employee Salary : ");
			employee.setEmpSalary(scanner.nextDouble());
			
			boolean status=bussinessLogic.addEmployee(employee);
			if(status)
				System.out.println("Employee added");
			else 
				System.out.println("Employee Not added");
			
			break;
		case 3: 
			System.out.println("Enter the ID of the employee whos record you want to delete : ");
			int Id=scanner.nextInt();
			if(bussinessLogic.deleteEmployee(Id))
				System.out.println("Record deleted");
			else 
				System.out.println("Employee with id : "+Id+" does not exist on this system");
			break;
		case 4:
			System.out.println("Enter the ID of the employee you would like to seach for");
			int idToFind=scanner.nextInt();
			if(bussinessLogic.getSingleEmployee(idToFind)==null)
				System.out.println("Employee with ID : "+idToFind+" is not found");
			else{
				System.out.println(bussinessLogic.getSingleEmployee(idToFind));
			};
			break;
		case 5: 
			bussinessLogic.saveAllEmployees();
			System.out.println("Thanks for using employee management system, Goodbye");
			System.exit(0);
		default:
			System.out.println("Invadlid Choice");
		}

	}

}
