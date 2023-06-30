package com.ellie.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ellie.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}