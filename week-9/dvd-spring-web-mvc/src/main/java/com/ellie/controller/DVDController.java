package com.ellie.controller;

import java.util.List;

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
		DVD dvd=dvdService.getDVDById(request.getParameter("title"));
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
	@RequestMapping("/showAllDVDs")
	public ModelAndView showAllDVDsController() {
		ModelAndView modelAndView=new ModelAndView();
		
		List<DVD> dvdList=dvdService.getAllDVDs();
		modelAndView.addObject("dvdList", dvdList);
		modelAndView.setViewName("DisplayAllDVDs");
		return modelAndView;
	}
	@RequestMapping("/InputDVDDetails")
	public ModelAndView InputDVDDetailsController() {
		return new ModelAndView("InputDVDDetails");
	}
	@RequestMapping("/saveDVD")
	public ModelAndView saveDVDController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		int dvdId=Integer.parseInt(request.getParameter("dvd_ID"));
		String title=request.getParameter("title");
		int MPAA_rating=Integer.parseInt(request.getParameter("MPAA_rating"));
		String director_name=request.getParameter("director_name");
		String studio=request.getParameter("studio");
		int user_rating=Integer.parseInt(request.getParameter("user_rating"));
		
		DVD dvd=new DVD(dvdId,title ,MPAA_rating,director_name,studio,user_rating);
		
		String message=null;
		if(dvdService.addDVD(dvd))
			message="DVD Added";
		else
			message="DVD Not Added";
		
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	@RequestMapping("/InputDvdIdForDelete")
	public ModelAndView inputDVDIdPageForDeleteController() {
		return new ModelAndView("InputDvdIdForDelete");
	}

	@RequestMapping("/deleteDVD")
	public ModelAndView deleteDVDController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		if (dvdService.deleteDVDById(request.getParameter("title"))) {
			message = "DVD with title " + request.getParameter("title") + " deleted !";
		} else {
			message = "DVD with title " + request.getParameter("title") + " not deleted !";
		}
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	@RequestMapping("/InputDvdIdForUpdate")
	public ModelAndView InputEmpDetailsPageForUpdateController(){
		return new ModelAndView("InputDvdIdForUpdate");
	}
	
	
	@RequestMapping("/updateDVDrating")
	public ModelAndView updateDVDratingController(HttpServletRequest request) {
		
		String message=null;
		int dvdId=Integer.parseInt(request.getParameter("dvdId"));
		int rating=Integer.parseInt(request.getParameter("rating"));
		if(dvdService.incrementRating(dvdId, rating))
			message="Rating changed for DVD with ID "+request.getParameter("dvdId");
		else
			message="Rating not changed for DVD with ID "+request.getParameter("dvdId");
		
		return new ModelAndView("Output", "message", message);
	}
}
