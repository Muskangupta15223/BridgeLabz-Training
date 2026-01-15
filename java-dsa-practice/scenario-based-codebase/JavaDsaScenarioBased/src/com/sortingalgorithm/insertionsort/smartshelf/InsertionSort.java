package com.sortingalgorithm.insertionsort.smartshelf;

public class InsertionSort {

    public void insertionSortByTitle(Book[] books) {

        for(int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            while(j >= 0 && books[j].getTitle().compareTo(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }
}
