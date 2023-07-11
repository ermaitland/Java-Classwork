package com.ellie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ellie.entity.Customer;
import com.ellie.entity.CustomerDetails;
import com.ellie.entity.CustomerShareDetailsList;
import com.ellie.entity.Shares;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerDetails> customerDetailsById(int customerId) {
		List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
		
		CustomerShareDetailsList customerShareDetailsList=restTemplate.getForObject("http://localhost:8082/customer/"+customerId,CustomerShareDetailsList.class);
		
		for(Customer customerShareDetail:customerShareDetailsList.getCustomerShareDetails()) {
			
			Shares shares=restTemplate.getForObject("http://localhost:8080/shares/"+customerShareDetail.getShareId(), Shares.class);
			
			CustomerDetails customerDetail=new CustomerDetails(customerId, shares.getShareName(), customerShareDetail.getShareType(), customerShareDetail.getQuantity(), shares.getSharePrice(),customerShareDetail.getQuantity()*shares.getSharePrice());
			
			customerList.add(customerDetail);
		}
		return customerList;
	}

}
