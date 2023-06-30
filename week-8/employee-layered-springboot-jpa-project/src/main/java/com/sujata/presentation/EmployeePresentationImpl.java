package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.dto.entity.Employee;
import com.sujata.service.EmployeeService;


@Component
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add New Employee");
		System.out.println("2. List All Employees ");
		System.out.println("3. Search Employee By ID");
		System.out.println("4. Delete Employee By ID");
		System.out.println("5. Increment Employee Salary");
		System.out.println("6. Search Employee By Name");
		System.out.println("7. Search Employees By Department");
		System.out.println("8. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Employee employee=new Employee();
			
			System.out.println("Enter Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			employee.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			employee.setDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			employee.setDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			employee.setSalary(scanner.nextDouble());
			
			if(employeeService.insertEmployee(employee)!=null)
				System.out.println("Employee Added");
			else
				System.out.println("Employee Not Added");
			break;

		case 2:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee emp:employees) {
				System.out.println(emp);
			}
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee searchedEmployee=employeeService.searchEmployeeById(id);
			if(searchedEmployee!=null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 4:
			System.out.println("Enter the ID of the Employee you wish to delete");
			int empId= scanner.nextInt();
			if(employeeService.deleteEmployeeById(empId) != null)
				System.out.println("Employee deleted");
			else
				System.out.println("Employee does not exist");
			break;
		case 5:
			System.out.println("Enter the ID of the Employee");
			int eId = scanner.nextInt();
			System.out.println("Enter increment ammount");
			int incAmount=scanner.nextInt();
			Employee incrementSalary=employeeService.incrementEmployeeSalary(eId, incAmount);
			if(incrementSalary!=null) {
				System.out.println("After increment, details are : ");
				System.out.println(incrementSalary);;
			}else
				System.out.println("Employee does not exist");
			break;
		case 6:
			System.out.println("Enter Name : ");
			String na=scanner.next();
			List<Employee> empList=employeeService.getEmployeeByName(na);
			if(empList.size()!=0) {
			for(Employee emp:empList) {
				System.out.println(emp);
			}
			}
			else
				System.out.println("No employee with name "+na+" exist in our records");
			break;
		case 7:
			System.out.println("Enter Department : ");
			String dep=scanner.next();
			List<Employee> emplList=employeeService.getEmployeesByDepartment(dep);
			if(emplList.size()!=0) {
			for(Employee emp:emplList) {
				System.out.println(emp);
			}
			}
			else
				System.out.println("No Employee works for "+dep+" department");
			break;
		case 8:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
