package com.CampusConnect;

public class Main {
	    public static void main(String[] args) {

	        Faculty teacher = new Faculty("Dr. Sharma", "sharma@uni.com", 101, "CSE");

	        Course java = new Course("Java", teacher);

	        Student s1 = new Student("Muskan", "muskan@uni.com", 1);

	        s1.enrollCourse(java);
	        s1.addGrade("Java", 85);

	        s1.printDetails();
	        teacher.printDetails();
	    }
	}
