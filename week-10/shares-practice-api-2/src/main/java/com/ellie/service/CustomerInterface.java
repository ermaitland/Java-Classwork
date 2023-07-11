package com.ellie.service;

import java.util.List;

import com.ellie.entity.Customer;

public interface CustomerInterface {
	List<Customer> getCustomerById(int customerId);
}
