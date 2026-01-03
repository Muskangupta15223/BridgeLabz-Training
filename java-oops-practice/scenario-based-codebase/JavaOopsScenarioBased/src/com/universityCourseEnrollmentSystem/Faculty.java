package com.universityCourseEnrollmentSystem;

public class Faculty {
    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public String gradeStudent(double rawScore) {
        if (rawScore >= 85) return "A";
        if (rawScore >= 70) return "B";
        if (rawScore >= 55) return "C";
        if (rawScore >= 40) return "D";
        return "F";
    }
}
