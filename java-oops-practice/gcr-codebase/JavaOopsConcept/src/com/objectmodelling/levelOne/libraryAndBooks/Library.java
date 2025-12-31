package com.objectmodelling.levelOne.libraryAndBooks;
import java.util.*;
public class Library {

    String libraryName;
    ArrayList<Book> books;
    
	Library(String libraryName){
		this.libraryName = libraryName;
		books = new ArrayList<>();
	}
	void addBook(Book book) {
		books.add(book);
	}
	void displayLibraryBooks() {
	      System.out.println("Library: " + libraryName);
	        for (Book b : books) {
	            b.displayBook();
	        }
	        System.out.println();
	}
}
