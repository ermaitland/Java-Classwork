package com.ellie.shares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ellie")
@EntityScan(basePackages = "com.ellie.entity")
@EnableJpaRepositories(basePackages = "com.ellie.persistence")
public class SharesPracticeApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(SharesPracticeApi2Application.class, args);
	}

}
