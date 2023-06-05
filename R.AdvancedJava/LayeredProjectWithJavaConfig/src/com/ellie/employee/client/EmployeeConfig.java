package com.ellie.employee.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ellie.employee.persistance.EmployeeDataAccessImpl;
import com.ellie.employee.service.EmployeeBussienssLogicImpl;
import com.ellie.employee.ui.EmployeeUserInteracelmpl;

@Configuration
public class EmployeeConfig {

	@Bean("dataAccess")
	public EmployeeDataAccessImpl getData() {
		return new EmployeeDataAccessImpl();
	}
	
	@Bean("service")
	public EmployeeBussienssLogicImpl service() {
		return new EmployeeBussienssLogicImpl(getData());
	}
	
	@Bean("userInterface")
	public EmployeeUserInteracelmpl userInterface() {
		return new EmployeeUserInteracelmpl(service());
	}
}
