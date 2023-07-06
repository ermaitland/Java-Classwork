package com.ellie.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ellie.entity.DVD;
import com.ellie.model.service.DVDService;

@Controller
public class DVDController {

	@Autowired
	DVDService dvdService;
	
	@RequestMapping("/")
	public ModelAndView mainController() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/inputIdPage")
	public ModelAndView inputController() {
		return new ModelAndView("InputDVDIdPage");
	}
	
	@RequestMapping("/searchDVDById")
	public ModelAndView searchController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		DVD dvd=dvdService.getDVDById(Integer.parseInt(request.getParameter("DVDId")));
		if(dvd!=null) {
			modelAndView.addObject("DVD", dvd);
			modelAndView.setViewName("ShowDVD");
		}
		else {
			modelAndView.addObject("message", "DVD with ID "+request.getParameter("DVDId")+" does not exist");
			modelAndView.setViewName("Output");
			
		}
			
		
		return modelAndView;
		
	}
	
}
