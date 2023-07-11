package com.ellie.shares.service;

import java.util.List;

import com.ellie.shares.entity.CustomerService;


public interface CustomerServiceInterface {
	
	List<CustomerService> getDetails(int customerId);
}
