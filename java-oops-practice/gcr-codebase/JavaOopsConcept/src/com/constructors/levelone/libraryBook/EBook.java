package com.constructors.levelone.libraryBook;

public class EBook extends Book {

    String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Access public and protected members
    public void displayEBookDetails() {
        System.out.println("ISBN        : " + ISBN);     
        System.out.println("Title       : " + title);   
        System.out.println("File Format : " + fileFormat);
    }
}

