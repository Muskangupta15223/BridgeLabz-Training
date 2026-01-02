package com.encapsulation.employeemanagementsystem;

public class Main {
	public static void main(String args[]) {
		Employee e1 = new FullTimeEmployee(123,"Am");
		Employee e2 = new PartTimeEmployee(13,"muskan");
		
		e1.calculateSalary(5); // extraHour 
		e2.calculateSalary(1);
		
		e1.assignDepartment();
		e1.getDepartmentDetails();
		
		e1.displayDetails();
		
		  System.out.println("--------------");
		e2.assignDepartment();
		e2.getDepartmentDetails();
		e2.displayDetails();
	}
	
}
