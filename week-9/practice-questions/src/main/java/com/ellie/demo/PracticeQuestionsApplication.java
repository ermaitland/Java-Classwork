package com.ellie.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ellie.entitiy.Person;
import com.ellie.entitiy.Vehicle;
import com.ellie.persistence.PersonDao;
import com.ellie.persistence.VehicleDao;

@SpringBootApplication
@EntityScan(basePackages = "com.ellie.entity")
@EnableJpaRepositories(basePackages = "com.ellie.persistence")
public class PracticeQuestionsApplication implements CommandLineRunner {

	@Autowired
	private VehicleDao vehicleDao;
	@Autowired
	private PersonDao personDao;
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeQuestionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Vehicle v1=new Vehicle(101, "Fiat", 8);
		Vehicle v2=new Vehicle(102, "Mercedes", 1);
		Vehicle v3=new Vehicle(103, "Audi", 2);
		Vehicle v4=new Vehicle(104, "Mini", 7);


		Person p1=new Person(1, "Ellie", 28);
		p1.getVehicleList().add(v2);
		p1.getVehicleList().add(v3);
		
		Person p2=new Person(002, "Claire", 28);
		p2.getVehicleList().add(v1);
		
		Person p3=new Person(003, "James", 28);
		p3.getVehicleList().add(v4);
		
		
		
				
		vehicleDao.save(v1);
		vehicleDao.save(v2);
		vehicleDao.save(v3);
		vehicleDao.save(v4);
		
		personDao.save(p1);
		personDao.save(p2);
		personDao.save(p3);
	}

}
