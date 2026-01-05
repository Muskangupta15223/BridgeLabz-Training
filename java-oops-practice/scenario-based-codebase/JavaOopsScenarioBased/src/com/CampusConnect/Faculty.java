package com.CampusConnect;
class Faculty extends Person {

    private String department;

    public Faculty(String name, String email, int id, String department) {
        super(name, email, id);
        this.department = department;
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}