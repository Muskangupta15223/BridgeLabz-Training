package com.lambdaexpression.schoolstudentsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SchoolManagement {

	public static void main(String args[]) {
		List<Student>students = Arrays.asList(
				new Student("Muskan", 21 , 83 , 3),
				new Student("Krishna", 19 , 63 , 7),
				new Student("Afroz", 23 , 88 , 2),
				new Student("Raghav", 20 , 78 , 5),
				new Student("Ragini", 16 , 93 , 1),
				new Student("Karan", 14 , 29 , 9),
				new Student("Manav", 19 , 31 , 8),
				new Student("Aasna", 18 , 69 , 6),
				new Student("Surbhi", 19 , 74 , 4),
				new Student("Gaurav", 20 , 23 , 10)
				); 
		
		// lambda = welcome Message
		Consumer<Student> welcomeStudent = 
				s -> System.out.println("Welcome " +s.getName()+" to the school");
		System.out.println("Welcome Message \n");
		students.forEach(welcomeStudent);
		
		
		// lambda = pass/fail check
		int passingValue = 35;
		Predicate<Student>isPassed = 
				s -> s.getMark() >= passingValue;		
		System.out.println("\n Student Result pass/fail \n");
		students.forEach(s ->
				System.out.println(
						s.getName() + " : " + 
						(isPassed.test(s) ? " Pass " : " Fail ")
				)
		);
				
		// lambda = sort by name
		Comparator<Student> sortByName =
		        (s1, s2) -> s1.getName().compareTo(s2.getName());
		students.sort(sortByName);   
		System.out.println("\n Student list sorted by name : \n ");
		students.forEach(System.out::println);		
		
		// lambda = sort by rank
		Comparator<Student> sortByRank =
		        (s1, s2) -> Integer.compare(s1.getRank(), s2.getRank());
		students.sort(sortByRank);
		System.out.println("\n Student list sorted by rank : \n ");
		students.forEach(System.out::println);
		
		// lambda = sort by age
		System.out.println("\n Student list sorted by age : \n ");
		students.stream()
		        .filter(s -> s.getAge() > 18)
		        .forEach(System.out::println);
		
	}
}
