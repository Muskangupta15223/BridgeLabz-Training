package com.objectmodelling.levelOne.universitymanagement;

public class Main{
	    public static void main(String[] args) {

	        University uni = new University("ABC University");

	        Student ram = new Student("Ram");
	        Student shyam = new Student("Shyam");

	        Professor profA = new Professor("Dr. A");

	        Course java = new Course("Java Programming");

	        uni.addStudent(ram);
	        uni.addStudent(shyam);
	        uni.addProfessor(profA);

	        java.assignProfessor(profA);

	        ram.enrollCourse(java);
	        shyam.enrollCourse(java);
	    }
	}