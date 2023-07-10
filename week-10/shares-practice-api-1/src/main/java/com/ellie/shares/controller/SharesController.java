package com.ellie.shares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.shares.entity.Shares;
import com.ellie.shares.entity.SharesList;
import com.ellie.shares.service.SharesServiceImpl;
import com.ellie.shares.service.SharesServiceInterface;

@RestController
public class SharesController {
	
	@Autowired
	SharesServiceImpl sharesService;
	
	@CrossOrigin
	@GetMapping(path = "/shares/{sharesId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Shares> searchEmployeeByIdResource(@PathVariable("sharesId") String id) {
		Shares shares=sharesService.searchSharesById(id);
		ResponseEntity response=null;
		if(shares!=null)
			response=new ResponseEntity<Shares>(shares, HttpStatus.FOUND);
		else
			response=new ResponseEntity<Shares>(shares,HttpStatus.NOT_FOUND);
		return response;
	}
	
	@CrossOrigin
	@GetMapping(path="/shares",produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<SharesList> getAllEmployees() {
		SharesList sharesList= new SharesList(sharesService.getAllShares());
		if(sharesList.getShares().size()>0)
			return new ResponseEntity<SharesList>(sharesList,HttpStatus.OK);
		else
			return new ResponseEntity<SharesList>(sharesList,HttpStatus.NO_CONTENT);
	}
}
