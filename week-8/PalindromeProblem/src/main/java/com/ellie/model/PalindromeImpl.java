package com.ellie.model;

import org.springframework.stereotype.Service;

@Service
public class PalindromeImpl implements Palindrome {
	private int reverse;
	@Override
	public String palindrome(int number) {
		
		int num=number;
		while(number>0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
		if(reverse==num)
			return "True";
		else if(reverse!=number)
			return "False";
		return "Oops something went wrong";
	}

}
