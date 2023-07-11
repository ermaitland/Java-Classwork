package com.ellie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ellie.entity.CustomerDetails;
import com.ellie.service.CustomerDetailsService;

@Controller
public class ManagementController {
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@RequestMapping("/")
	public ModelAndView getMainPageController() {
		return new ModelAndView("InputCustomerId");
	}
	
	@RequestMapping("/showData")
	public ModelAndView getDataController(@RequestParam("customerId") int cId) {
		ModelAndView modelAndView=new ModelAndView();
		List<CustomerDetails> customerDetails=customerDetailsService.customerDetailsById(cId);
		
		modelAndView.addObject("customerDetailsList", customerDetails);
		modelAndView.setViewName("ShowDetails");
		return modelAndView;
	}
}
