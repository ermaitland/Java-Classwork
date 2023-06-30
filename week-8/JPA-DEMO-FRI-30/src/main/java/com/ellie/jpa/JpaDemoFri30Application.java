package com.ellie.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ellie.entity.Employee;
import com.ellie.persistance.EmployeeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.ellie.entity")
@EnableJpaRepositories(basePackages = "com.ellie.persistance")
public class JpaDemoFri30Application {

	@Autowired
	EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoFri30Application.class, args);
	}

	
	public void run(String... args) throws Exception {
		employeeDao.save(new Employee(101, "AAAA", "Executive", "Sales", 56000));
		
	}

}
