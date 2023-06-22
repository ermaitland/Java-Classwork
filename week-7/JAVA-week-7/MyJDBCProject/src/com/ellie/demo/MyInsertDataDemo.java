package com.ellie.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar;

public class MyInsertDataDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement;
		Scanner scanner=new Scanner(System.in);
		try {
			// 1) Register Driver: 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.1) Connect to database:
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root", "Scoubie44");
			
			// 2.2) prepared Statement/execute query 
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)");
			System.out.println("Enter the Emp Id: ");
			int id=scanner.nextInt();
			preparedStatement.setInt(1, id);
			System.out.println("Enter the Emp Name: ");
			String name=scanner.next();
			preparedStatement.setString(2, name);
			System.out.println("Enter the Emp Designation: ");
			String designation=scanner.next();
			preparedStatement.setString(3, designation);
			System.out.println("Enter the Emp Depatrment: ");
			String department=scanner.next();
			preparedStatement.setString(4, department);
			System.out.println("Enter the Emp Age: ");
			int age=scanner.nextInt();
			preparedStatement.setInt(5, age);
			System.out.println("Enter the Emp date of joining (yyy-mm-dd): ");
			String date=scanner.next();
			preparedStatement.setString(6, date);
			
			/// returns an integer of how many rows are getting updated
			int rows = preparedStatement.executeUpdate();
			
			// 3) Process Results: 
			if(rows > 0 )
				System.out.println("Employee Added!");
			else {
				System.out.println("Employee not added!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				// 4) close connection 
				connection.close();
			}catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}