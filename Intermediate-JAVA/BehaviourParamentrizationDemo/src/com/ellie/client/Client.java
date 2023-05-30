package com.ellie.client;

import com.ellie.demo.AuthorAPredicate;
import com.ellie.demo.BookSearch;
import com.ellie.demo.ExpensiveBookPredicate;
import com.ellie.demo.ThickBookPredicate;

public class Client {

	public static void main(String[] args) {
		BookSearch bookSearch=new BookSearch();
//		System.out.println("Author A : "+bookSearch.getBooksByAuthorA());
		System.out.println("All books : "+bookSearch.getAllBook());
//		System.out.println("The thick books : "+bookSearch.getThickBooks());
		System.out.println("Author A : "+bookSearch.searchBook(new AuthorAPredicate()));
		System.out.println(bookSearch.searchBook(new ThickBookPredicate()));
		System.out.println("Expensive books : "+bookSearch.searchBook(new ExpensiveBookPredicate()));
	}

}
