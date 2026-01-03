package com.universityCourseEnrollmentSystem;

public class Main {
	 public static void main(String[] args) {
	        Student ug = new UnderGraduate(1, " Muskan ", 3.2, " AI ");
	        Student pg = new PostGraduate(2, " Shna ", 3.8, " ML ");
	        Course course = new Course(101, " Object Oriented Programming ");

	        Enrollment ugEnrollment = new Enrollment(ug, course, 78);
	        Enrollment pgEnrollment = new Enrollment(pg, course, 62);

	        Faculty faculty = new Faculty(10, "Dr. Vishal");

	        System.out.println("-- Transcripts --");
	        System.out.println(ug.viewTranscript());
	        System.out.println(pg.viewTranscript());

	        System.out.println("\n-- Enrollment Results --");
	        System.out.println(ugEnrollment.enrollmentSummary());
	        System.out.println(pgEnrollment.enrollmentSummary());

	        System.out.println("\n-- Faculty Letter Grades --");
	        System.out.println("UG letter: " + faculty.gradeStudent(ugEnrollment.assignGrade().equals("Pass") ? 85 : 45));
	        System.out.println("PG letter: " + faculty.gradeStudent(pgEnrollment.assignGrade().equals("Pass") ? 75 : 35));
	}
}
