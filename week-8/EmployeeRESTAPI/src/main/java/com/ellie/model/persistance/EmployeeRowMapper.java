package com.ellie.model.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ellie.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee=new Employee(0, null, null, null, 0, null);
		
		employee.setEmpId(resultSet.getInt("EMPID"));
		employee.setEmpName(resultSet.getString("EMPNAME"));
		employee.setEmpDesignation(resultSet.getString("DESIGNATION"));
		employee.setEmpDepartment(resultSet.getString("DEPTT"));
		employee.setAge(resultSet.getInt("AGE"));
		employee.setDateOfJoining(resultSet.getString("DATEOFJOINING"));
		
		return employee;
	}

}