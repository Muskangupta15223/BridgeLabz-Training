package com.colletors.librarybookstatistics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class BookStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 300),
                new Book("Advanced Java", "Programming", 550),
                new Book("Harry Potter", "Fiction", 450),
                new Book("The Hobbit", "Fiction", 350),
                new Book("Data Science", "Education", 400)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println("--------------------");
        });
    }
}

