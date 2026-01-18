package com.sortingalgorithm.insertionsort.smartlibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartLibrary {

    // Method to insert a new book and keep list sorted using Insertion Sort
    public static void insertionSort(ArrayList<String> books) {
        for (int i = 1; i < books.size(); i++) {
            String key = books.get(i);
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && books.get(j).compareToIgnoreCase(key) > 0) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> borrowedBooks = new ArrayList<>();

        System.out.println("Enter number of books to issue:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book title:");
            String book = sc.nextLine();
            borrowedBooks.add(book);

            // Auto-sort after each insertion
            insertionSort(borrowedBooks);
        }

        System.out.println("\nBorrowed Books (Alphabetically Sorted):");
        for (String book : borrowedBooks) {
            System.out.println(book);
        }

        sc.close();
    }
}
