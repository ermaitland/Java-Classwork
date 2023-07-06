package com.ellie.dvd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ellie")
@EntityScan(basePackages = "com.ellie.entity")
@EnableJpaRepositories(basePackages = "com.ellie.model.persistence")
public class DvdSpringWebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdSpringWebMvcApplication.class, args);
	}

}
