package com.java8.stringlogical;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionProgram {

	public static void main(String args[]) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("B", 1);
		map.put("C", 2);

		//27 Sort Map by Value
		Map<String, Integer> sortedMap =
		        map.entrySet()
		           .stream()
		           .sorted(Map.Entry.comparingByValue())
		           .collect(Collectors.toMap(
		                   Map.Entry::getKey,
		                   Map.Entry::getValue,
		                   (oldVal, newVal) -> oldVal,
		                   LinkedHashMap::new
		           ));
		System.out.println(sortedMap);
	
		List<String> list = Arrays.asList("a", "bb", "ccc", "dd");
		// group by length
		Map<Integer, List<String>> groupedByLength =
		        list.stream()
		            .collect(Collectors.groupingBy(String::length));
		System.out.println(groupedByLength);

		//frequency of each character
		String input = "banana";
		Map<Character, Long> freqMap = 
				input.chars()
		        	 .mapToObj(c -> (char) c)
		        	 .collect(Collectors.groupingBy(
		              c -> c,
		              Collectors.counting()
		        ));
		System.out.println(freqMap);

        //count occurrences of words in a string	        
		String str = "java is java and java is fast";
	    Map<String, Long> countfreq =
	    		Arrays.stream(str.split(" "))
	        		  .collect(Collectors.groupingBy(
	        		  word -> word,Collectors.counting()
	          ));
	    System.out.println(countfreq);		
	
	    // 21. Partition numbers into even and odd
	    List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
	    Map<Boolean, List<Integer>> partition =
	                list2.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
	    System.out.println("Partition Even/Odd: " + partition);

	    // 22. Find duplicate elements only
        List<Integer> list3 = Arrays.asList(1,2,3,2,4,5,1);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = list3.stream()
        								.filter(n -> !seen.add(n))
        								.distinct()
        								.collect(Collectors.toList());
        System.out.println("Duplicates: " + duplicates);

        // 25. Flatten list of lists
        List<List<Integer>> listOfLists =
                Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5));
        List<Integer> flatList = listOfLists.stream()
                							.flatMap(List::stream)
                							.collect(Collectors.toList());
        System.out.println("Flattened List: " + flatList);
	
        //Find Employee with Highest Salary
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Muskan", 80000),
                new Employee(3, "Rahul", 60000)
        );
        
        Employee highestPaid =
                employees.stream()
                         .max(Comparator.comparing(Employee::getSalary))
                         .orElse(null);
        System.out.println(highestPaid);
        
        
        
	}
}
