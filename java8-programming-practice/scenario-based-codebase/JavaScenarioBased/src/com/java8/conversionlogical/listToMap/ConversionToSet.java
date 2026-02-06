package com.java8.conversionlogical.listToMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConversionToSet {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 10,50, 30, 20, 40);
		System.out.println("1.Convert List to Set (remove duplicates)");
		Set<Integer> set =
		        list.stream()
		            .collect(Collectors.toSet());
		System.out.println(set);
		
		System.out.println("\n 2.Convert List to LinkedHashSet ");
		Set<Integer>linkedset =
				list.stream()
					.collect(Collectors.toCollection(LinkedHashSet::new));;
		System.out.println(linkedset);
		System.out.println("\n 3.Convert List to TreeSet");
		Set<Integer>treeset=
					list.stream()
						.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(treeset);
		
		System.out.println("\n 4.Convert Set to List");
		Set<String> set2 = new HashSet<>();
		set2.add("java");
		set2.add("boot");
		set2.add("spring");
		set2.add("boot");
		set2.add("spring");
		
		List<String> list1 =
		        set2.stream().collect(Collectors.toList());
		System.out.println(list1);

		System.out.println("\n5.Convert Set to Sorted List");
		Set<Integer> set3 = new HashSet<>(Arrays.asList(5, 2, 9, 1));

		List<Integer> list3 =
		        set3.stream()
		           .sorted()
		           .collect(Collectors.toList());
		System.out.println(list3);

		System.out.println("\n 6.Convert Set of objects to List of names");
		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee(1, "Aman",20000));
		employees.add(new Employee(2, "Neha",40000));
		employees.add(new Employee(3, "Ravi",30000));

		List<String> names =
		        employees.stream()
		                 .map(Employee::getName)  
		                 .collect(Collectors.toList());

		System.out.println(names);

		System.out.println("\n 7.Convert List to Set after filtering condition");
		Set<Integer>evenSet =
				list.stream()
					.filter( n -> n % 2 == 0)
					.collect(Collectors.toSet());
		System.out.println(evenSet);
		
		System.out.println("\n 8.Convert List to Set of squares");
		Set<Integer> squareSet =
		        Arrays.asList(1,2,3,4)
		              .stream()
		              .map(n -> n * n)
		              .collect(Collectors.toSet());

		System.out.println(squareSet);
	
		System.out.println("\n 9.Convert Set to List and reverse order");
		list1= set2.stream()
					.sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
		System.out.println(list1);
	
		System.out.println("\n 10.Merge two Lists and convert to Set");
		List<Integer> first = Arrays.asList(1, 2, 3, 4);
		List<Integer> second = Arrays.asList(3, 4, 5, 6);
		
		Set<Integer> mergedSet =
		        Stream.concat(first.stream(), second.stream())
		              .collect(Collectors.toSet());
		System.out.println(mergedSet);

	}
}
