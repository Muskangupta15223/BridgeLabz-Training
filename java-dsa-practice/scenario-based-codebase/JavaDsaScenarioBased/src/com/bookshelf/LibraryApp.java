package com.bookshelf;

public class LibraryApp {
	 public static void main(String[] args) {

	     BookShelf library = new BookShelf();

	     Book b1 = new Book("The Alchemist", "Paulo Coelho");
	     Book b2 = new Book("Clean Code", "Robert Martin");
	     Book b3 = new Book("Harry Potter", "J.K. Rowling");

	     library.addBook("Fiction", b1);
	     library.addBook("Programming", b2);
	     library.addBook("Fantasy", b3);

	     library.displayCatalog();

	     library.borrowBook("Fiction", b1);
	     library.displayCatalog();

	     library.returnBook("Fiction", b1);
	     library.displayCatalog();
	 }
}