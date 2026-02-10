package com.java8.conversionlogical.listToMap;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class ConversionObjectToCollection {

	public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "spring", "boot", "java");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);

        List<Employe> employees = Arrays.asList(
                new Employe(1, "Vaidik", "IT", 50000),
                new Employe(2, "Ravi", "HR", 45000),
                new Employe(3, "Shivam", "IT", 70000),
                new Employe(4, "Raghav", "Sales", 60000),
                new Employe(5, "Akshat", "Sales", 55000)
        );
        
        System.out.println("\n*** OBJECT COLLECTION CONVERSIONS ***");

        System.out.println("\n1. Employees → Map<ID, Employee>\n");
        System.out.println(employees.stream()
                .collect(Collectors.toMap(
                        Employe::getId,
                        Function.identity()
                )));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n2. Employees → Map<Dept, List<Employee>>\n");
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employe::getDept)));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n3. Employees → Set of Departments\n");
        System.out.println(employees.stream()
                .map(Employe::getDept)
                .collect(Collectors.toSet()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n4. Objects → Field List\n");
        System.out.println(employees.stream()
                .map(Employe::getName)
                .collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n5. Objects → Grouped Map\n");
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employe::getDept)));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n6. Map Objects → Name List\n");
        System.out.println(employees.stream()
                .map(Employe::getName)
                .collect(Collectors.toList()));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n7. Salary By Name Map\n");
        System.out.println(employees.stream()
                .collect(Collectors.toMap(
                        Employe::getName,
                        Employe::getSalary
                )));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n8. Nested List → Flat List\n");
        List<List<Employe>> nested = Arrays.asList(employees, employees);
        nested.stream()
              .flatMap(List::stream)
              .forEach(System.out::println);
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n9. Employees → Dept Total Salary\n");
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(
                        Employe::getDept,
                        Collectors.summingDouble(Employe::getSalary)
                )));
        System.out.println("________________________________________________________________________________________________");


        System.out.println("\n10. Composite Key Map\n");
        System.out.println(employees.stream()
                .collect(Collectors.toMap(
                        e -> e.getName() + "-" + e.getDept(),
                        Employe::getSalary
                )));
        System.out.println("________________________________________________________________________________________________");


	}
}
