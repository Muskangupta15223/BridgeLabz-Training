package com.functionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {

        // 1. Print student details
        List<Student> students = Arrays.asList(
                new Student("Muskan", 21, "Computer Science"),
                new Student("Rohit", 22, "Mechanical")
        );

        Consumer<Student> printStudent =
                s -> System.out.println(
                        "Name: " + s.getName() +
                        ", Age: " + s.getAge() +
                        ", Course: " + s.getCourse()
                );

        System.out.println("Student Details");
        students.stream().forEach(printStudent);

        // 2. Log employee login activity
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "09:00 AM"),
                new Employee("Neha", "09:15 AM")
        );

        Consumer<Employee> logLogin =
                e -> System.out.println(
                        "Employee " + e.getName() +
                        " logged in at " + e.getLoginTime()
                );

        System.out.println("\nEmployee Login Logs");
        employees.stream().forEach(logLogin);

        // 3. Print order confirmation
        List<Order> orders = Arrays.asList(
                new Order(101, "Laptop"),
                new Order(102, "Phone")
        );

        Consumer<Order> orderConfirmation =
                o -> System.out.println(
                        "Order confirmed. Order ID: " + o.getOrderId() +
                        ", Product: " + o.getProductName()
                );

        System.out.println("\nOrder Confirmation");
        orders.stream().forEach(orderConfirmation);

        // 4. Display account balance
        List<Account> accounts = Arrays.asList(
                new Account("Muskan", 15000),
                new Account("Amit", 8200)
        );

        Consumer<Account> displayBalance =
                a -> System.out.println(
                        "Account Holder: " + a.getAccountHolder() +
                        ", Balance: " + a.getBalance()
                );

        System.out.println("\nAccount Balance");
        accounts.stream().forEach(displayBalance);

        // 5. Send notification message
        List<Notification> notifications = Arrays.asList(
                new Notification("Muskan", "Your order has been shipped"),
                new Notification("Rohit", "Password changed successfully")
        );

        Consumer<Notification> sendNotification =
                n -> System.out.println(
                        "Sending notification to " + n.getRecipient() +
                        ": " + n.getMessage()
                );

        System.out.println("\nNotifications");
        notifications.stream().forEach(sendNotification);
    }
}
