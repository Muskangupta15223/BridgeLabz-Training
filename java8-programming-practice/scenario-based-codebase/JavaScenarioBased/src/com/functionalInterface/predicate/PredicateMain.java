package com.functionalInterface.predicate;
import java.util.*;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {

        //Students
        List<Student> students = Arrays.asList(
                new Student("Muskan", 80),
                new Student("Rohit", 65),
                new Student("Anjali", 90)
        );

        Predicate<Student> examEligible = s -> s.getAttendance() >= 75;

        System.out.println(" Student Exam Eligibility");
        students.stream()
                .forEach(s -> System.out.println(
                        "Name: " + s.getName() +
                        ", Attendance: " + s.getAttendance() +
                        " → Eligible: " + examEligible.test(s)
                ));

        //Employees
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 25000),
                new Employee("Neha", 45000),
                new Employee("Pooja", 60000)
        );

        Predicate<Employee> highSalary = e -> e.getSalary() > 30000;

        System.out.println("\n Employee Salary Status");
        employees.stream()
                .forEach(e -> System.out.println(
                        "Name: " + e.getName() +
                        ", Salary: " + e.getSalary() +
                        " → High Salary: " + highSalary.test(e)
                ));

        //Withdrawal
        double balance = 10000;
        List<Double> withdrawAmounts = Arrays.asList(2000.0, 6000.0, 12000.0);

        Predicate<Double> validWithdraw = amt -> amt <= balance;

        System.out.println("\nBank Withdrawal");
        withdrawAmounts.stream()
                .forEach(amt -> System.out.println(
                        "Withdraw Amount: " + amt +
                        " → Allowed: " + validWithdraw.test(amt)
                ));

        //Free Delivery
        List<Double> orderAmounts = Arrays.asList(300.0, 700.0, 1200.0);

        Predicate<Double> freeDelivery = amt -> amt >= 500;

        System.out.println("\n Free Delivery Check");
        orderAmounts.stream()
                .forEach(amt -> System.out.println(
                        "Order Amount: " + amt +
                        " → Free Delivery: " + freeDelivery.test(amt)
                ));

        // Even Number
        List<Integer> numbers = Arrays.asList(10, 15, 22);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("\n Even Number Check");
        numbers.stream()
                .forEach(n -> System.out.println(
                        "Number: " + n +
                        " → Even: " + isEven.test(n)
                ));
    }
}
