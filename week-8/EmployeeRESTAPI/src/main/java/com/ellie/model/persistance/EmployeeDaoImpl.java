package com.ellie.model.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ellie.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee getRecordById(int id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EMPID=?", new EmployeeRowMapper(), id);
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

}