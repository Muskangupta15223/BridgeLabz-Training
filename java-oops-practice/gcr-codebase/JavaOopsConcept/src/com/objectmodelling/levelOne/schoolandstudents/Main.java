package com.objectmodelling.levelOne.schoolandstudents;

public class Main {
	 public static void main(String[] args) {

	        // School
	        School school = new School("Green Valley School");

	        // Students
	        Student s1 = new Student("Muskan");
	        Student s2 = new Student("Amit");

	        // Courses
	        Course c1 = new Course("Java");
	        Course c2 = new Course("DBMS");

	        // Aggregation
	        school.addStudent(s1);
	        school.addStudent(s2);

	        // Association
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);
	        s2.enrollCourse(c1);

	        // Output
	        school.showStudents();
	        System.out.println();

	        s1.viewCourses();
	        System.out.println();
	        s2.viewCourses();
	        System.out.println();

	        c1.showStudents();
	        c2.showStudents();
	    }
	}
