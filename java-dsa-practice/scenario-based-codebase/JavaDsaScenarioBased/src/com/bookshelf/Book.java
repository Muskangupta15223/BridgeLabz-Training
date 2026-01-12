package com.bookshelf;

import java.util.*;
class Book {
 String title;
 String author;

 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 // Override equals & hashCode to avoid duplicates
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Book)) return false;
     Book book = (Book) o;
     return title.equals(book.title) && author.equals(book.author);
 }

 @Override
 public int hashCode() {
     return Objects.hash(title, author);
 }

 @Override
 public String toString() {
     return title + " by " + author;
 }
}

