package com.ellie.demostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList=Arrays.asList(new Employee(101, "AAAA","Software","Senior",29000), 
				new Employee(102, "EEEE", "Sales", "Manager",20000), 
				new Employee(103, "DDDD", "Engineering", "Mid", 24000), 
				new Employee(104, "CCCC", "HR", "Executive", 26000), 
				new Employee(105, "BBBB", "Sales", "Manager", 21000));
		System.out.println("Total number of employees working in sales department : "+empList.stream().filter(employee->employee.getEmpDep().equals("Sales")).count());
	
		empList.stream().
		filter(employee->employee.getEmpDesignation().equals("Senior")).map(employee->employee.getEmpName()).forEach(name->System.out.println(name));
		
		System.out.println("Mangers in sales department : "+empList.stream().
		filter(employee->employee.getEmpDep().equals("Sales")).
		filter(employee->employee.getEmpDesignation().equals("Manager")).count());
		
		List<Employee> beginB=empList.stream().filter(employee-> employee.getEmpName().startsWith("B")).collect(Collectors.toList());
		
		System.out.println("Employee who's name belongs with B : "+beginB);
		
}

}
