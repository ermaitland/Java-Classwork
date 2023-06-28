package com.ellie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.entity.DVD;
import com.ellie.entity.DVDList;
import com.ellie.model.service.DVDService;

@RestController
public class DVDResource {
	
	@Autowired
	DVDService dvdService;
	
	@CrossOrigin
	@GetMapping(path="/dvds",produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<DVDList> getAllDVDs() {
		DVDList dvdList= new DVDList(dvdService.getAllDVDs());
		if(dvdList.getDVDs().size()>0)
			return new ResponseEntity<DVDList>(dvdList,HttpStatus.OK);
		else
			return new ResponseEntity<DVDList>(dvdList,HttpStatus.NO_CONTENT);
	}
	
	@CrossOrigin
	@GetMapping(path = "/dvds/{title}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DVD> searchDVDByTitleResource(@PathVariable("title") String title) {
		DVD dvd=dvdService.searchDVDByTitle(title);
		ResponseEntity response=null;
		if(dvd!=null)
			response=new ResponseEntity<DVD>(dvd, HttpStatus.OK);
		else
			response=new ResponseEntity<DVD>(dvd,HttpStatus.NOT_FOUND);
		return response;
	}
}