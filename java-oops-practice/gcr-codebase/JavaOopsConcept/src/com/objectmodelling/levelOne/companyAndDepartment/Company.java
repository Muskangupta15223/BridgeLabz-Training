package com.objectmodelling.levelOne.companyAndDepartment;

import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    // Simulating deletion
    void closeCompany() {
        departments.clear();  // all departments & employees removed
        System.out.println("Company closed. All departments and employees removed.");
    }
}

