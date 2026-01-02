package com.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee {

	FullTimeEmployee(int id, String empName) {
		super(id, empName);
	}
	
	@Override
	public void calculateSalary(int extraHour){
			baseSalary = 50000;
			extraHour = extraHour * 500;
			System.out.println(baseSalary + extraHour);
	}
	@Override
	public void assignDepartment() {
		System.out.println("HR");
	}
	@Override
	public void  getDepartmentDetails() {
		System.out.println("Full-Time HR");
	}
}
