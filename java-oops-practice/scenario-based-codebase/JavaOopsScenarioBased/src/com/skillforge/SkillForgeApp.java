package com.skillforge;

public class SkillForgeApp {

    public static void main(String[] args) {

        Instructor instructor =
                new Instructor("Ankit", "ankit@skillforge.com", "Java");

        Student student =
                new Student("Ram", "ram@gmail.com");

        Course course =
                new Course("Java Foundations", instructor);

        course.showCourseDetails();

        student.updateProgress(50);
        student.updateProgress(50);
        student.assignGrade(75);

        System.out.println("Progress: " + student.getProgress() + "%");

        student.generateCertificate();

        BeginnerCourse bc =
                new BeginnerCourse("Java Basics", instructor);
        bc.generateCertificate(student);

        AdvancedCourse ac =
                new AdvancedCourse(
                        "Advanced Java",
                        instructor,
                        new String[]{"JVM", "Multithreading", "Spring"}
                );
        ac.generateCertificate(student);
    }
}