package com.objectmodelling.levelOne.universitymanagement;
import java.util.*;
public class University {
    String universityName;
    List<Student> students;
    List<Professor> professors;

    University(String universityName) {
        this.universityName = universityName;
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void addProfessor(Professor professor) {
        professors.add(professor);
    }
}