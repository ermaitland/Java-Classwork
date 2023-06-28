package com.ellie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ellie.model.Palindrome;


@RestController
public class PalindromeResource {

	@Autowired
	private Palindrome palindrome;
	
	@GetMapping(path = "/palindrome/{number}")
	public String palindrome(@PathVariable("number") int number) {
		return palindrome.palindrome(number);
	}
}
