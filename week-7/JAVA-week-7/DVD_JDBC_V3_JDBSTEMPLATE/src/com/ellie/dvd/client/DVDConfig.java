package com.ellie.dvd.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ellie.dvd.persistence.DVDDaoImpl;
import com.ellie.dvd.presentation.DVDUserInterfaceImpl;
import com.ellie.dvd.service.DVDServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.ellie.dvd") 
public class DVDConfig {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/DVDLib");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Scoubie44");
		return driverManagerDataSource;
	}
	
	/*
	 * is responsible for creating the query and execute them as well
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
