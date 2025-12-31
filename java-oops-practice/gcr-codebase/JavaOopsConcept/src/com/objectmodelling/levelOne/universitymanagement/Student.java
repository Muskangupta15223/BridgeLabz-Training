package com.objectmodelling.levelOne.universitymanagement;
import java.util.*;
public class Student {
    String studentName;
    List<Course> courses;

    Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.students.add(this);
        System.out.println(studentName + " enrolled in " + course.courseName);
    }
}


