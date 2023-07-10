package com.ellie.shares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ellie")
@EntityScan(basePackages = "com.ellie.shares.entity")
@EnableJpaRepositories(basePackages = "com.ellie.shares.persistence")
public class SharesPracticeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharesPracticeApiApplication.class, args);
	}

}
