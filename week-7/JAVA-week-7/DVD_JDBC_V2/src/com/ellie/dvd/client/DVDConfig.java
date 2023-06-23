package com.ellie.dvd.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ellie.dvd.persistence.DVDDaoImpl;
import com.ellie.dvd.presentation.DVDUserInterfaceImpl;
import com.ellie.dvd.service.DVDServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.ellie.dvd") 
public class DVDConfig {

}
