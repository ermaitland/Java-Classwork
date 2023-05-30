package com.ellie.demo;

import com.ellie.dto.Book;

public class AuthorAPredicate implements BookPredicate {

	@Override
	public boolean checkBook(Book book) {
		return book.getAuthorName().equals("Author A");
	}

}
