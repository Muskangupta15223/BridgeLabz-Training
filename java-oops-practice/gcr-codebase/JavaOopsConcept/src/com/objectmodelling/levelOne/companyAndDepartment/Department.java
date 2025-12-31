package com.objectmodelling.levelOne.companyAndDepartment;

import java.util.ArrayList;

class Department {
    private String deptName;
    private ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

