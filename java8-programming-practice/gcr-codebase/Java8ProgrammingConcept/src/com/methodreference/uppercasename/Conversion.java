package com.methodreference.uppercasename;

import java.util.Arrays;
import java.util.List;

public class Conversion {

	public static void main(String args[]) {
		List<Employee>employee = Arrays.asList(
				new Employee("Krishna", 40000),
				new Employee("Soumya", 20000),
				new Employee("Muskan", 50000)
		);
		
		employee.stream().map(e -> e.name).
		map(String :: toUpperCase).
		forEach(System.out :: println);
	}
}
