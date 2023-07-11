package com.ellie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.entity.CustomerShareDetailsList;
import com.ellie.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@GetMapping(path = "/customer/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerShareDetailsList getCustomerById(@PathVariable("cid") int customerId) {
		return new CustomerShareDetailsList(customerService.getCustomerById(customerId));	
	}
}
