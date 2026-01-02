package com.encapsulation.employeemanagementsystem;

public abstract class Employee implements Department {
	private int employeeId;
	private String name;
	protected double baseSalary;
	
	Employee(int id, String empName){
		employeeId = id;
		name = empName;
	}

	 public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBaseSalary() {
	        return baseSalary;
	    }

	    public abstract void calculateSalary(int hour);
	    
	    public void displayDetails() {
	        System.out.println("ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + baseSalary);
	    }
	}
