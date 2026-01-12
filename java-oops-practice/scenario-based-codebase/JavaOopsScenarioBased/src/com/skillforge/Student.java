package com.skillforge;

public class Student extends User implements ICertifiable {

    private int progress;   
    private int grade;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.grade = 0;
    }

    public void updateProgress(int value) {
        progress += value;
        if (progress > 100) progress = 100;
    }

    public void assignGrade(int marks) {
        grade = marks;
    }

    public int getProgress() {
        return progress;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && grade >= 40) {
            System.out.println("Certificate Generated for Student: " + name);
        } 
        else {
            System.out.println("Course not completed or insufficient grade.");
        }
    }
}