package com.java8.conversionlogical.listToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConversionToMap {

	public static void main(String args[]) {
		
		System.out.println("\n 1. Convert List of strings to Map with string as key and length as value");
		List<String> list1 = Arrays.asList("Ajay", "Binod", "Chunmun", "Dimple");
		Map<String,Integer> lengthOfString = 
				list1.stream().collect(Collectors.toMap(word -> word, String::length));
		System.out.println(lengthOfString);
		
		
		System.out.println("\n 2.Convert List of integers to Map with number and its square");
		List<Integer>list2 = Arrays.asList(9,8,6,4,5);
		Map<Integer,Integer> squareOfNumber = 
				list2.stream().collect(Collectors.toMap(n->n, n->n*n));
		System.out.println(squareOfNumber);
		
		
		System.out.println("\n 3. Convert List of employees to Map with id as key and name as value");
		List<Employee> employees = Arrays.asList(
				new Employee(7, "Ajay", 50000),
				new Employee(1, "Binod", 60000),
				new Employee(8, "Chunmun", 70000),
				new Employee(4, "Dimple", 80000)
				);
		Map<Integer,String> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
		System.out.println(employeeMap);
	
		
		System.out.println("\n 4.Convert List of words to Map with word and frequency");
		List<String> words = Arrays.asList(
		        "java", "spring", "java", "boot", "spring", "java","hibernate"
		);
		Map<String, Long>freqMap = words.stream().collect(Collectors.groupingBy(word -> word , Collectors.counting()));
		System.out.println(freqMap);
	
		
		System.out.println("\n 5.Convert List to Map with index as key and element as value");
		Map<Integer,String>indexMap = IntStream.range(0,words.size())
											.boxed().collect(Collectors
													.toMap(i -> i, words::get));
		System.out.println(indexMap);
		
		System.out.println("\n 6.Convert List of objects to Map using custom key field");
		Map<Integer, Employee> empMap =
		        employees.stream()
		                 .collect(Collectors.toMap(
		                         Employee::getId,      
		                         emp -> emp            
		                 ));

		System.out.println(empMap);
		
		
		System.out.println("\n 7.Convert List to Map and handle duplicate keys ");
		Map<String, String> handleDuplicate =
				words.stream().collect(
							  Collectors.toMap(word-> word, 
							                    String::toUpperCase,
						                        (oldValue,newValue) -> oldValue
						       ));
		System.out.println(handleDuplicate);
		
		System.out.println("\n 8.Convert List to Map keeping only first duplicate");
		List<String> list4 = Arrays.asList(
		        "jaVa","JAVA","JavA" ,"map","Map","MaP"   
		);
		Map<Integer, Object>firstMap = list4.stream().collect(Collectors
													.toMap(String::length,
															word -> word,
															(oldVal,newVal)-> oldVal
													));
		System.out.println(firstMap);
		
		System.out.println("\n 9.Convert List to Map keeping only last duplicate");
		Map<Integer, Object>lastMap = list4.stream().collect(Collectors
													.toMap(String::length,
															word -> word,
															(oldVal,newVal)-> newVal
													));
		System.out.println(lastMap);
		
		System.out.println("\n 10.Convert List into Map grouped by string length");
		Map<Integer,List<String>> useGroupingBy =
				words.stream().distinct().collect(
							  Collectors.groupingBy(String::length));				 						      
		System.out.println(useGroupingBy);
		
	}}
