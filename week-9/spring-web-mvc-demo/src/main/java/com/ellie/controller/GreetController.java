package com.ellie.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ellie.model.service.Greet;

@Controller
public class GreetController {
	
	@Autowired
	private Greet greet;
	
	@RequestMapping("/")
	public ModelAndView firstController() {
		ModelAndView modelAndView=new ModelAndView();
		
		String displayMessage=greet.wish();
		
		modelAndView.addObject("message", displayMessage);
		modelAndView.setViewName("ShowMessage");
		
		return modelAndView;
	}
	
	@RequestMapping("/time")
	public ModelAndView secondController() {
		ModelAndView modelAndView=new ModelAndView();
		
		LocalDate localDate=LocalDate.now();
		
		String message="Welcome to my app at"+localDate;
		modelAndView.addObject("message", message);
		
		modelAndView.setViewName("ShowMessage");
		
		return modelAndView;
	}
}
