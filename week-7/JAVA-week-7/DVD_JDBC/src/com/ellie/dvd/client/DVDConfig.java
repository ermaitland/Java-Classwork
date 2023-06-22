package com.ellie.dvd.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ellie.dvd.persistence.DVDDaoImpl;
import com.ellie.dvd.presentation.DVDUserInterfaceImpl;
import com.ellie.dvd.service.DVDServiceImpl;

@Configuration
public class DVDConfig {

	@Bean("dataAccess")
	public DVDDaoImpl getData() {
		return new DVDDaoImpl();
	}
	
	@Bean("service")
	public DVDServiceImpl service() {
		return new DVDServiceImpl(getData());
	}
	
	@Bean("userInterface")
	public DVDUserInterfaceImpl userInterface() {
		return new DVDUserInterfaceImpl(service());
	}
}
