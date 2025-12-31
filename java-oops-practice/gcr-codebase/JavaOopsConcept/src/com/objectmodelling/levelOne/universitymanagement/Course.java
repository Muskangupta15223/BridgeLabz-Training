package com.objectmodelling.levelOne.universitymanagement;

import java.util.*;
public class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.professorName +
                " assigned to course " + courseName);
    }
}