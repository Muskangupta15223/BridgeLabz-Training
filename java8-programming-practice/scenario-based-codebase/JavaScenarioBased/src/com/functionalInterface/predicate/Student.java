package com.functionalInterface.predicate;


class Student {
    private String name;
    private int attendance;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public int getAttendance() {
        return attendance;
    }
}