package com.ellie.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ellie.dto.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{


}
