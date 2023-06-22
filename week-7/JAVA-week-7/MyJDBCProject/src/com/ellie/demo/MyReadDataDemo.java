package com.ellie.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyReadDataDemo {

	public static void main(String[] args) {
		// Whenever working on JDBC: 
		/*
		 * Steps: 
		 * 1) Register Driver
		 * 2) Connect:
		 * 		- to database
		 * 		- execute query
		 * 3) process result of query
		 * 4) close connection  
		 */
		
		Connection connection=null;
		PreparedStatement preparedStatement;
		try {
			// 1) Register Driver: 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.1) Connect to database:
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root", "Scoubie44");
			
			// 2.2) prepared Statement/execute query 
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			// 3) Process Results: 
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String depart=resultSet.getString("DEPARTMENT");
				int age=resultSet.getInt("EMPAGE");
				String dateOJoining=resultSet.getString("DATEOFJOINING");
				System.out.println(id+" "+name+" "+desig+" "+depart+" "+age+" "+dateOJoining);
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
