package com.objectmodelling.levelOne.university;

import java.util.ArrayList;

class University {
    private String universityName;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }
}

