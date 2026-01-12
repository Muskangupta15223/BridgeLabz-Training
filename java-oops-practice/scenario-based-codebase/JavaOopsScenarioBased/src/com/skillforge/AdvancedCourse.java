package com.skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    public void generateCertificate(Student student) {
        System.out.println("Advanced Level Certificate with Grade issued to " + student.name);
    }
}