package com.ellie.model.service;

import org.springframework.stereotype.Service;

@Service
public class GreetImpl implements Greet {

	@Override
	public String wish() {
	return "Welcome to the world of spring MVC";
	}

}
