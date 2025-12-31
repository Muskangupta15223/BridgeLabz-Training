package com.objectmodelling.levelOne.university;

public class Main {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("XYZ University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        // If University object is deleted,
        // Departments are also destroyed (Composition)
        // Faculty objects still exist (Aggregation)
        
    }
}

