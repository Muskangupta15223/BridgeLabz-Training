package com.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

class BookShelf {

 // genre → list of books
 private Map<String, LinkedList<Book>> catalog = new HashMap<>();

 // to avoid duplicate books
 private Set<Book> bookSet = new HashSet<>();

 // Add book
 public void addBook(String genre, Book book) {
     if (bookSet.contains(book)) {
         System.out.println("❌ Book already exists: " + book);
         return;
     }

     catalog.putIfAbsent(genre, new LinkedList<>());
     catalog.get(genre).add(book);
     bookSet.add(book);

     System.out.println("✅ Book added: " + book);
 }

 // Borrow book
 public void borrowBook(String genre, Book book) {
     if (!catalog.containsKey(genre) || !catalog.get(genre).remove(book)) {
         System.out.println("❌ Book not available: " + book);
         return;
     }

     bookSet.remove(book);
     System.out.println("📖 Book borrowed: " + book);
 }

 // Return book
 public void returnBook(String genre, Book book) {
     addBook(genre, book);
 }

 // Display catalog
 public void displayCatalog() {
     System.out.println("\n📚 Library Catalog:");
     for (String genre : catalog.keySet()) {
         System.out.println("Genre: " + genre);
         for (Book book : catalog.get(genre)) {
             System.out.println("  - " + book);
         }
     }
 }
}



