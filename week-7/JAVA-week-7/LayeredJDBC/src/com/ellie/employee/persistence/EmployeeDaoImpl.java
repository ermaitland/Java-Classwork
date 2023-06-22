package com.ellie.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ellie.employee.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection connection=null;
	PreparedStatement preparedStatement;
	@Override
	public List<Employee> getAllRecords() {
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			connectToDataBase();
			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("EMPID");
				String name = resultSet.getString("EMPNAME");
				String desig = resultSet.getString("DESIGNATION");
				String depart = resultSet.getString("DEPARTMENT");
				int age = resultSet.getInt("EMPAGE");
				String date = resultSet.getString("DATEOFJOINING");
				Employee employee = new Employee(id, name, desig, depart, age, date);
				employeeList.add(employee);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return employeeList;
		}

	}

	@Override
	public int addRecord(Employee employee) {
		
		try {
			connectToDataBase();
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)");
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setInt(5, employee.getEmpAge());
			preparedStatement.setString(6, employee.getDateOfJoining());
			int rows = preparedStatement.executeUpdate();
			return rows;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
	public void connectToDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root", "Scoubie44");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int deleteRecord(int id) {
		try {
			connectToDataBase();
			preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");
			preparedStatement.setInt(1, id);
			int rows = preparedStatement.executeUpdate();
			return rows;	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
		}

	@Override
	public int updateRecord(int id, int increment) {
	try {
		connectToDataBase();
		String query="UPDATE EMPLOYEE SET SALARY=SALARY+"+increment+" where EMPID="+id;
		preparedStatement = connection.prepareStatement(query);
		
		int rows = preparedStatement.executeUpdate();

		return rows;

	} catch (SQLException e) {
		return 0;
	} finally {
		try {
//			4.Close Connection
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	}
