package com.lambdaexpression.officesystem;

public class Employee {

	private String name;
	private double salary;
	private int years;
	
	Employee(String name, double salary, int years){
		this.name = name;
		this.salary = salary;
		this.years = years;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getYears() {
		return years;
	}
	@Override
	public String toString() {
		return "Name : " + name + ", Salary : " + salary + ", Years : "+ years;
	}
}
