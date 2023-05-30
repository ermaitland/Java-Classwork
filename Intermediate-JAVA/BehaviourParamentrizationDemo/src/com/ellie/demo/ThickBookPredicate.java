package com.ellie.demo;

import com.ellie.dto.Book;

public class ThickBookPredicate implements BookPredicate{
	@Override
	public boolean checkBook(Book book){
		
		return book.getNoOfPages()>1500;
	}
}
