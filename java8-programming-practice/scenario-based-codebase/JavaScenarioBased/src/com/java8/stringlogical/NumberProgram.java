package com.java8.stringlogical;

import java.util.*;
import java.util.stream.Collectors;

public class NumberProgram {

	 public static void main(String[] args) {

	        // 3. Find even numbers from list
	        List<Integer> list1 = Arrays.asList(2,5,7,8,10,13);
	        List<Integer> evens = list1.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());
	        System.out.println("Even numbers: " + evens);
	        
	        // 8. Sum of all numbers  
	        int sum = list1.stream().mapToInt(Integer::intValue).sum();
	        System.out.println("Sum: " + sum);
	  
	        // 9. Find max number
	        int max = list1.stream().max(Integer::compareTo).get();
	        System.out.println("Max: " + max);
	        
	        // 11. Remove duplicate elements
	        List<Integer> list2 = Arrays.asList(1,2,2,3,4,4,5);
	        List<Integer> distinct = list2.stream().distinct().collect(Collectors.toList());
	        System.out.println("Distinct: " + distinct);
	        
	        // 12. Sort list in descending order
	        List<Integer> desc = list1.stream()
	                .sorted(Comparator.reverseOrder())
	                .collect(Collectors.toList());
	        System.out.println("Descending: " + desc);

	        // 13. Find second highest number
	        int secondHighest = list1.stream()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .get();
	        System.out.println("Second Highest: " + secondHighest);
	        
	        // 16. Find numbers greater than 50
	        List<Integer> list3 = Arrays.asList(10,55,60,23,90);
	        List<Integer> greaterThan50 = list3.stream()
	                .filter(n -> n > 50)
	                .collect(Collectors.toList());
	        System.out.println("Greater than 50: " + greaterThan50);
	        

	        // 19. Convert List<Integer> to List<String>
	        List<String> stringList = list3.stream()
	                .map(String::valueOf)
	                .collect(Collectors.toList());
	        System.out.println("Integer to String: " + stringList);
	        
	        // 24. Find top 3 highest numbers
	        List<Integer> top3 = list3.stream()
	                .sorted(Comparator.reverseOrder())
	                .limit(3)
	                .collect(Collectors.toList());
	        System.out.println("Top 3: " + top3);

	        // 26. Find sum of squares of even numbers
	        int sumOfSquares = list1.stream()
	                .filter(n -> n % 2 == 0)
	                .map(n -> n * n)
	                .mapToInt(Integer::intValue)
	                .sum();
	        System.out.println("Sum of squares of evens: " + sumOfSquares);
	        
	        // 29. Find common elements between two lists
	        List<Integer> l1 = Arrays.asList(1,2,3,4);
	        List<Integer> l2 = Arrays.asList(3,4,5,6);
	        List<Integer> common = l1.stream()
	                .filter(l2::contains)
	                .collect(Collectors.toList());
	        System.out.println("Common elements: " + common);

	        // 30. Find kth smallest element
	        int k = 2;
	        int kthSmallest = list1.stream()
	                .sorted()
	                .skip(k - 1)
	                .findFirst()
	                .get();
	        System.out.println("Kth Smallest: " + kthSmallest);
	        
	        
	        
	 }
}
