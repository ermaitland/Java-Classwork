package com.ellie.demo;

import java.util.ArrayList;

import com.ellie.dto.Book;

public class BookSearch {

		private ArrayList<Book> books;
		
		public BookSearch() {
			books=new ArrayList<Book>();
			books.add(new Book(101, "Book 1", 780, "Author X", 5600));
			books.add(new Book(102, "Book 2", 1800, "Author A", 1200));
			books.add(new Book(103, "Book 3", 2500, "Author X", 1000));
			books.add(new Book(104, "Book 4", 650, "Author B", 8900));
		}
		
		public ArrayList<Book> getAllBook(){
			return books;
		}
		
//		public ArrayList<Book> getBooksByAuthorA(){
//			ArrayList<Book> bookList=new ArrayList<Book>();
//			
//			for(Book book:books) {
//				if(book.getAuthorName().equals("Author A"))
//					bookList.add(book);
//			}
//			return bookList;
//		}
//		public ArrayList<Book> getThickBooks(){
//			ArrayList<Book> bookList=new ArrayList<Book>();
//			
//			for(Book book:books) {
//				if(book.getNoOfPages()>1500)
//					bookList.add(book);
//			}
//			return bookList;
//		}
		
		public ArrayList<Book> searchBook(BookPredicate bookPredicate){
		ArrayList<Book> bookList=new ArrayList<Book>();
			
			for(Book book:books) {
				if(bookPredicate.checkBook(book))
					bookList.add(book);
			}
			return bookList;
		}
}
