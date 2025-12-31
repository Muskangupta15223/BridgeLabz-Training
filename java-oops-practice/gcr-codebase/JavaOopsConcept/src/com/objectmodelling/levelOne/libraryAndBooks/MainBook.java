package com.objectmodelling.levelOne.libraryAndBooks;

public class MainBook {
	  public static void main(String[] args) {
		  
	        // Books exist independently
	        Book book1 = new Book("Java Basics", "James Gosling");
	        Book book2 = new Book("Python Guide", "Guido van Rossum");
	        Book book3 = new Book("C Programming", "Dennis Ritchie");

	        // Libraries
	        Library cityLibrary = new Library("City Library");
	        Library collegeLibrary = new Library("College Library");

	        // Adding books to libraries
	        cityLibrary.addBook(book1);
	        cityLibrary.addBook(book2);

	        collegeLibrary.addBook(book2);
	        collegeLibrary.addBook(book3);

	        // Display Libraries
	        cityLibrary.displayLibraryBooks();
	        collegeLibrary.displayLibraryBooks();
	    }
	}
