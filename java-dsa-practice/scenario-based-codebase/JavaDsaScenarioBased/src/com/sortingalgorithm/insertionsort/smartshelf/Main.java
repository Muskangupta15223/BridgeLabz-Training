package com.sortingalgorithm.insertionsort.smartshelf;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Charles Dickens", "Pinocchio");
        books[1] = new Book("James Clear", "Atomic Habits");
        books[2] = new Book("Premchand", "Godaan");

        InsertionSort is = new InsertionSort();
        is.insertionSortByTitle(books);

        for(Book b : books) {
            System.out.println(b.getTitle() + " - " + b.getAuthor());
        }
    }
}
