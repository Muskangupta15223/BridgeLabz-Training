package com.java8.stringlogical;

import java.util.*;
import java.util.stream.Collectors;

public class StringProgram {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "", "avocado", "grape", "", "apricot");

        System.out.println("Original list : " + words);

        // Remove empty strings
        List<String> removeEmpty = words.stream()
                .filter(word -> !word.isEmpty())
                .toList();
        System.out.println("After removing empty strings: " + removeEmpty);

        words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot");

        // Words starting with 'a'
        List<String> startWithA = words.stream()
                .filter(word -> word.startsWith("a"))
                .toList();
        System.out.println("Words starting with letter 'a': " + startWithA);

        // Find length of each word
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Length of each word: " + lengths);

        // Convert to uppercase
        List<String> upperCase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Words converted to uppercase: " + upperCase);

        // Find longest string
        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest word from the list: " + longest);

        // Count vowels
        String input = "programming";
        long vowelCount = input.chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("Total vowels in the word '" + input + "': " + vowelCount);

        // Count words in a sentence
        String sentence = "Java is very powerful";
        long wordCount = Arrays.stream(sentence.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Total number of words in the sentence: " + wordCount);

        // Reverse each string
        List<String> reversedWords = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .toList();
        System.out.println("Each word reversed: " + reversedWords);

        // First non-repeated character
        Character nonRepeatedChar = (char) input.chars()
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst()
                .orElse(-1);
        System.out.println("First non-repeated character in '" + input + "': " + nonRepeatedChar);

        // Join strings with comma
        String joinedWords = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("All words joined using comma: " + joinedWords);
    }
}
