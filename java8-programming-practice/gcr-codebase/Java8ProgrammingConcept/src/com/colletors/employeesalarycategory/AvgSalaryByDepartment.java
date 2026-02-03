package com.colletors.employeesalarycategory;
import java.util.*;
import java.util.stream.Collectors;

public class AvgSalaryByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Muskan", "IT", 60000),
                new Employee("Rahul", "HR", 45000),
                new Employee("Neha", "IT", 75000),
                new Employee("Aman", "Finance", 50000),
                new Employee("Priya", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println(avgSalaryByDept);
    }
}
