package com.skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    public void generateCertificate(Student student) {
        System.out.println("Beginner Level Certificate issued to " + student.name);
    }
}