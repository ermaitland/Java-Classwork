package com.ellie.service;

import java.util.List;

import com.ellie.entity.CustomerDetails;

public interface CustomerDetailsService {
	List<CustomerDetails> customerDetailsById(int customerId);
}
