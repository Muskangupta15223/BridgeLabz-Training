package com.objectmodelling.levelOne.companyAndDepartment;

public class Main {
	 public static void main(String[] args) {

	        Company company = new Company("TechNova Pvt Ltd");

	        Department dev = new Department("Development");
	        dev.addEmployee(101, "Amit");
	        dev.addEmployee(102, "Neha");

	        Department hr = new Department("HR");
	        hr.addEmployee(201, "Riya");

	        company.addDepartment(dev);
	        company.addDepartment(hr);

	        company.displayCompanyDetails();

	        System.out.println("\n--- Closing Company ---");
	        company.closeCompany();
	    }
	}