package com.ellie.demo;

import com.ellie.dto.Book;

public interface BookPredicate {
	boolean checkBook(Book book);
}
