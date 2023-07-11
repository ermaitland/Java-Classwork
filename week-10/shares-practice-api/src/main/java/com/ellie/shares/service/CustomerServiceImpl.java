package com.ellie.shares.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ellie.shares.entity.Customer;
import com.ellie.shares.entity.CustomerService;
import com.ellie.shares.entity.Shares;
import com.ellie.shares.entity.SharesList;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerService> getDetails(int customerId) {
		List<CustomerService> customerServiceList=new ArrayList<CustomerService>();
		
		List<Customer> customerList= (List<Customer>) restTemplate.getForObject("http://localhost:8084/customer/"+customerId, Customer.class);
		for(Customer customer:customerList) {
			Shares shares=restTemplate.getForObject("http://localhost:8082/shares/"+customer.getShareId(), Shares.class);
			
			CustomerService customerService=new CustomerService();
			customerService.setCustomerId(customerId);
			customerService.setShareName(shares.getShareName());
			customerService.setQuanitiy(customer.getQuantity());
			customerService.setSharePrice(shares.getSharePrice());
			customerService.setTotal(shares.getSharePrice()*customer.getQuantity());
			customerService.setShareType(customer.getShareType());
			
			customerServiceList.add(customerService);
		}
		
		return customerServiceList;
	}

}
