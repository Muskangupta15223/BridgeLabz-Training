package com.objectmodelling.levelOne.libraryAndBooks;

public class Book {
	String title;
	String author;
	
	 Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    void displayBook() {
	        System.out.println("Title: " + title + ", Author: " + author);
	    }
	
}
