package com.constructors.levelone.libraryBook;

public class MainBook {

	public static void main(String[] args) {
		  EBook ebook = new EBook(
	                "978-0135166307",
	                "Effective Java",
	                "Joshua Bloch",
	                "PDF"
	        );

	        ebook.displayEBookDetails();
    }
}

