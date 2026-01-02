package com.hospitalPatientManagementSystem;

public class OutPatient extends Patient {
	
	String visitDate;
	
	OutPatient(int patientId, String patientName, int age,String disease ,String visitDate) {
		super(patientId, patientName, age, disease);
		  this.visitDate = visitDate;
	}
	
	public void displayInfo() {
		System.out.println("Name : " + patientName + "\nId : " + patientId + "\nvisit date : " + visitDate);
	}
	
}

