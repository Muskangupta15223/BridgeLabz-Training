package com.encapsulation.employeemanagementsystem;

public class PartTimeEmployee extends Employee {

	PartTimeEmployee(int id, String empName) {
		super(id, empName);
	}
	
	@Override
	public void calculateSalary(int extraHour){
			baseSalary = 20000;
			extraHour = extraHour * 500;
			System.out.println(baseSalary + extraHour);
	}
	@Override
	public void assignDepartment() {
		System.out.println("Developer");
	}
	@Override
	public void  getDepartmentDetails() {
		System.out.println(" Part - Time developer");
	}
}