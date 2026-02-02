package com.lambdaexpression.officesystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OfficeSystemApp {

	public static void main(String args[]) {
		
		List<Employee>employees = Arrays.asList(
			new Employee(" Muskan ", 80000, 5),
			new Employee("Krishna ", 70000, 3),
			new Employee("  Amit  ", 88000, 1),	
			new Employee(" Soumya ", 30000, 2),	
			new Employee("  Anuj  ", 40000, 4),	
			new Employee(" Raghav ", 50000, 5)	
		);
		
		// Calculate bonus
		System.out.println("\n Calculate Bonus :- ");
		employees.stream()
		        .filter(e -> e.getSalary() > 50000)
		        .forEach(e -> {
		            double bonus = e.getSalary() * 0.5;
		            System.out.println(e.getName() + " → Bonus: " + bonus);
		        });
		
		// sort by salary
		System.out.println("\n Sort salary :- ");
		employees.stream()
		     .sorted((s1,s2) -> Double.compare(s1.getSalary(), s2.getSalary()))
		     .forEach(e ->
		     System.out.println(e.getName() +" -> Salary : "+ e.getSalary()));
	
		// check promotion eligibility
		System.out.println("\n check promotion eligiblity:- ");
		Predicate<Employee>isPromoted = e -> e.getYears() > 3;
		employees.forEach(e -> System.out.println(
				 e.getName() + " -> " + (isPromoted.test(e) ? "Eligile" : "Not")
				));
				 
		System.out.println("\n Print details");		 
		employees.forEach(System.out::println);
		
		System.out.println("\n Compare two employees salaries");	
		Comparator<Employee> salaryComparator =
		        Comparator.comparingDouble(Employee::getSalary);

		for (int i = 0; i < employees.size() - 1; i++) {
		    
		        Employee e1 = employees.get(i);
		        Employee e2 = employees.get(i +1);

		        int result = salaryComparator.compare(e1, e2);
		        if (result > 0) {
		            System.out.println(
		                e1.getName() + " has higher salary than " + e2.getName()
		            );
		        } else if (result < 0) {
		            System.out.println(
		                e2.getName() + " has higher salary than " + e1.getName()
		            );
		        } else {
		            System.out.println(
		                e1.getName() + " and " + e2.getName() + " have equal salary"
		            );
		        }
	       }
	 }
}
