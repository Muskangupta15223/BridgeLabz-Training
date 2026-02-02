package com.lambdaexpression.basicsystemtask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

	public static void main(String args[]) {
		System.out.println(" Original List ");
		List<Integer>list = Arrays.asList(11,61,18,33,65,44, 647, 89,37,12,98);
		System.out.println(list);
		
		System.out.println("\n Even and Odd numbers from the list ");
		List<Integer> evenList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		
		System.out.println(evenList);
		System.out.println(oddList);
		
		System.out.println("\n Sum of two numbers using lambda ");
		list.stream()
		    .reduce((a, b) -> a + b)
		    .ifPresent(sum -> System.out.println("Sum: " + sum));
		
		System.out.println("\n Greater of two numbers using lambda ");
		for (int i = 0; i < list.size() - 1; i++) {
		    int num1 = list.get(i);
		    int num2 = list.get(i + 1);

		    int greater = (num1 > num2) ? num1 : num2;
		    System.out.println("Greater between " + num1 + " and " + num2 + " is: " + greater);
		}
	}
}
