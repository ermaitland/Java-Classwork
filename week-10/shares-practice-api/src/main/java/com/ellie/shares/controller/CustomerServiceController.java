package com.ellie.shares.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.shares.entity.CustomerService;
import com.ellie.shares.service.CustomerServiceInterface;

@RestController
public class CustomerServiceController {
	
	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@GetMapping(path = "details/{cid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerService> getDetailsByCId(@PathVariable("cid") int customerId) {
		List<CustomerService> customerServiceList= new ArrayList<CustomerService>();
		customerServiceList=(customerServiceInterface.getDetails(customerId));
		return customerServiceList;
	}
}
