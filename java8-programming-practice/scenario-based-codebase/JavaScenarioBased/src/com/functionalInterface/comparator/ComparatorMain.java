package com.functionalInterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {

        // 1. Compare students by rank
        List<Student> students = Arrays.asList(
                new Student("Muskan", 3),
                new Student("Rohit", 1),
                new Student("Anjali", 2)
        );

        Comparator<Student> rankComparator =
                Comparator.comparingInt(Student::getRank);

        students.stream()
                .sorted(rankComparator)
                .forEach(s ->
                        System.out.println(
                                "Student: " + s.getName() +
                                ", Rank: " + s.getRank()
                        )
                );

        // 2. Compare employees by salary
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 30000),
                new Employee("Neha", 50000),
                new Employee("Amit", 40000)
        );

        Comparator<Employee> salaryComparator =
                Comparator.comparingDouble(Employee::getSalary);

        System.out.println();
        employees.stream()
                .sorted(salaryComparator)
                .forEach(e ->
                        System.out.println(
                                "Employee: " + e.getName() +
                                ", Salary: " + e.getSalary()
                        )
                );

        // 3. Compare products by price
        List<Product> products = Arrays.asList(
                new Product("Laptop", 50000),
                new Product("Phone", 20000),
                new Product("Tablet", 30000)
        );

        Comparator<Product> priceComparator =
                Comparator.comparingDouble(Product::getPrice);

        System.out.println();
        products.stream()
                .sorted(priceComparator)
                .forEach(p ->
                        System.out.println(
                                "Product: " + p.getName() +
                                ", Price: " + p.getPrice()
                        )
                );

        // 4. Compare strings by length
        List<String> names = Arrays.asList(
                "Java",
                "SpringBoot",
                "API",
                "Microservices"
        );

        Comparator<String> lengthComparator =
                Comparator.comparingInt(String::length);

        System.out.println();
        names.stream()
                .sorted(lengthComparator)
                .forEach(name ->
                        System.out.println(
                                "String: " + name +
                                ", Length: " + name.length()
                        )
                );

        // 5. Compare bank accounts by balance
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Muskan", 15000),
                new BankAccount("Amit", 8000),
                new BankAccount("Rohit", 22000)
        );

        Comparator<BankAccount> balanceComparator =
                Comparator.comparingDouble(BankAccount::getBalance);

        System.out.println();
        accounts.stream()
                .sorted(balanceComparator)
                .forEach(a ->
                        System.out.println(
                                "Account Holder: " + a.getAccountHolder() +
                                ", Balance: " + a.getBalance()
                        )
       );
    }
}
