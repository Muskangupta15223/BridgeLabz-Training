package com.CampusConnect;
import java.util.*;

class Student extends Person implements ICourseActions {

    private Map<String, Integer> grades = new HashMap<>();
    private List<Course> courses = new ArrayList<>();

    public Student(String name, String email, int id) {
        super(name, email, id);
    }

    // Encapsulation: grades private
    public void addGrade(String courseName, int marks) {
        grades.put(courseName, marks);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int total = 0;

        for (int marks : grades.values()) {
            total += marks;
        }

        return grades.size() == 0 ? 0 : (double) total / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + calculateGPA());
    }
}

