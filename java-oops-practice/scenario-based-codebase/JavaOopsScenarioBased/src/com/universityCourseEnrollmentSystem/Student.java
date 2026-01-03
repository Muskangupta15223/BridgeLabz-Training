package com.universityCourseEnrollmentSystem;

public abstract class Student {
    private int studentId;
    private String name;
    private double gpa;
    private String electivePreference;

    protected Student(int studentId, String name, double gpa) {
        this(studentId, name, gpa, null);
    }

    protected Student(int studentId, String name, double gpa, String electivePreference) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.electivePreference = electivePreference;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public String getElectivePreference() { return electivePreference; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public String viewTranscript() {
        String electiveInfo = electivePreference == null ? "none" : electivePreference;
        return "Student{" +
                "id=" + studentId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", elective='" + electiveInfo + '\'' +
                '}';
    }
}