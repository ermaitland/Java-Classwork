package com.ellie.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialImpl implements Factorial {

	@Override
	public int factorial(int num) {
		int i;
		int factorial=num;
		for(i=num-1;i>0;i--) {
			factorial*=i;
		}
		return factorial;
	}



}
