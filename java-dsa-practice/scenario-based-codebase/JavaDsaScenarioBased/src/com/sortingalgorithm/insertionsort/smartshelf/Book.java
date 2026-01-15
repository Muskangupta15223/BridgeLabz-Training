package com.sortingalgorithm.insertionsort.smartshelf;

public class Book {
    private String author;
    private String title;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
