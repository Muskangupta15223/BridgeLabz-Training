package com.colletors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Muskan", 2500),
                new Order("Rahul", 1500),
                new Order("Muskan", 3000),
                new Order("Rahul", 2000),
                new Order("Neha", 1800),
                new Order("Amit", 3900),
                new Order("Krishna", 2600),
                new Order("Neha", 800)
        );

        Map<String, Double> revenue =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        System.out.println(revenue);
    }
}

