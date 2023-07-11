package com.ellie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.Customer;
import com.ellie.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerInterface {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public List<Customer> getCustomerById(int customerId) {
		return customerDao.findByCustomerId(customerId);
	}

}
