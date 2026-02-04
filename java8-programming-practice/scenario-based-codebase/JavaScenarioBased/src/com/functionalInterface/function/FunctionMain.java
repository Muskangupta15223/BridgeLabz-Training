package com.functionalInterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {

        // 1. Convert student marks to grade
        List<Student> students = Arrays.asList(
                new Student("Muskan", 85),
                new Student("Rohit", 65),
                new Student("Anjali", 45)
        );

        Function<Student, String> gradeFunction = s -> {
            if (s.getMarks() >= 75) return "A";
            else if (s.getMarks() >= 60) return "B";
            else return "C";
        };

        System.out.println("Student Grades");
        students.stream()
                .forEach(s -> System.out.println(
                        "Name: " + s.getName() +
                        ", Marks: " + s.getMarks() +
                        ", Grade: " + gradeFunction.apply(s)
                ));

        // 2. Calculate annual salary from monthly salary
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 30000),
                new Employee("Neha", 50000)
        );

        Function<Employee, Double> annualSalary =
                e -> e.getMonthlySalary() * 12;

        System.out.println("\nAnnual Salary");
        employees.stream()
                .forEach(e -> System.out.println(
                        "Name: " + e.getName() +
                        ", Annual Salary: " + annualSalary.apply(e)
                ));

        // 3. Convert product price to discounted price (10 percent discount)
        List<Product> products = Arrays.asList(
                new Product("Laptop", 50000),
                new Product("Phone", 20000)
        );

        Function<Product, Double> discountPrice =
                p -> p.getPrice() * 0.90;

        System.out.println("\nDiscounted Prices");
        products.stream()
                .forEach(p -> System.out.println(
                        "Product: " + p.getProductName() +
                        ", Discounted Price: " + discountPrice.apply(p)
                ));

        // 4. Convert employee name to uppercase
        Function<Employee, String> toUpperCaseName =
                e -> e.getName().toUpperCase();

        System.out.println("\nEmployee Names in Uppercase");
        employees.stream()
                .forEach(e -> System.out.println(
                        "Original Name: " + e.getName() +
                        ", Uppercase Name: " + toUpperCaseName.apply(e)
                ));

        // 5. Convert Celsius to Fahrenheit
        List<Double> temperatures = Arrays.asList(0.0, 25.0, 37.0);

        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;

        System.out.println("\nTemperature Conversion");
        temperatures.stream()
                .forEach(c -> System.out.println(
                        c + " Celsius = " + celsiusToFahrenheit.apply(c) + " Fahrenheit"
                ));
    }
}
