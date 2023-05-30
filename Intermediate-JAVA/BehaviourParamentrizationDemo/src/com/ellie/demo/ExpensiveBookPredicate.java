package com.ellie.demo;

import com.ellie.dto.Book;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean checkBook(Book book) {
		
		return book.getPrice()>2500;
	}

}
