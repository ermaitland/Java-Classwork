package com.ellie.presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ellie.entity.Student;
import com.ellie.service.StudentService;

@Component
public class StudentPresentationImpl implements StudentPresentation {

	@Autowired
	private StudentService studentService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Create New Student");
		System.out.println("2. Search Student By ID");
		System.out.println("3. Delete Student By ID");
		System.out.println("4. Update Students Class");
		System.out.println("5. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Student student=new Student();
			
			System.out.println("Enter Student ID : ");
			student.setRollNo(scanner.nextInt());
			System.out.println("Enter Student Name : ");
			student.setName(scanner.next());
			System.out.println("Enter Student Age : ");
			student.setAge(scanner.nextInt());
			System.out.println("Enter Student Class : ");
			student.setClassOfStudent(scanner.next());
			System.out.println("Enter Student Adress : ");
			student.setAddress(scanner.next());
			System.out.println("Enter Student Phone Number : ");
			student.setPhoneNumber(scanner.next());
			
			if(studentService.insertStudent(student)!=null)
				System.out.println("Student Added");
			else
				System.out.println("Student Not Added");
			break;
		case 2:
			System.out.println("Enter Student ID : ");
			int id=scanner.nextInt();
			Student searchedStudent=studentService.searchStudentById(id);
			if(searchedStudent!=null)
				System.out.println(searchedStudent);
			else
				System.out.println("Student with id "+id+" does not exist");
			break;
		case 3:
			System.out.println("Enter Student ID : ");
			int stuId=scanner.nextInt();
			if(studentService.deleteStudentById(stuId)!=null)
				System.out.println("Student Deleted with id "+stuId);
			else
				System.out.println("Student with id "+stuId+" does not exist");
			break;
		case 4:
			System.out.println("Enter Student ID : ");
			int stuId2=scanner.nextInt();
			System.out.println("Enter New Address :");
			String newAddress=scanner.next();
			Student editedStudent=studentService.editStudent(stuId2, newAddress);
			if(editedStudent!=null) {
				System.out.print("After Editing Student class : ");
				System.out.println(editedStudent);
			}
			else
				System.out.println("Student with id "+stuId2+" does not exist for salary increment");
			break;
		case 5:
			System.out.println("Thanks for using Student Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
