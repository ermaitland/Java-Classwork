package com.ellie.model.persistance;

import com.ellie.entity.Employee;

public interface EmployeeDao {

	public Employee getRecordById(int id);
}