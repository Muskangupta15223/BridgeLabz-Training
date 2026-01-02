package com.hospitalPatientManagementSystem;

public class Doctor {
	int doctorId;
	String doctorName;
	String specialization;
	
	Doctor(	int doctorId, String doctorName, String specialization){
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	
	public void displayDoctorInfo() {
		System.out.println("Name : " + doctorName + "\nId : " + doctorId + "\nspecialization : " + specialization);
	}
	public void consultPatient(Patient p) {
	     System.out.println("Doctor " + doctorName + " is consulting: ");
	        p.displayInfo(); 
	        System.out.println("Consultation completed.\n");
	}
}
