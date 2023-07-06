package com.ellie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ellie.service.Factorial;

@Controller
public class FactorialController {

		@Autowired
		Factorial factorial;
		
		@RequestMapping("/")
		public ModelAndView mainPageController() {
			return new ModelAndView("inputNumber");
		}
		
		@RequestMapping("/factorial")
		public ModelAndView displayController(HttpServletRequest request) {
			ModelAndView modelAndView=new ModelAndView();
			
			int number=Integer.parseInt(request.getParameter("number"));
			
			modelAndView.addObject("message", factorial.factorial(number));
			modelAndView.setViewName("displayFactorial");
			
			return modelAndView;
		}
}
