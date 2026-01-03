package com.universityCourseEnrollmentSystem;

public class Course {
    private int courseCode;
    private String name;

    public Course(int courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
    }

    public int getCourseCode() { return courseCode; }
    public String getName() { return name; }
}