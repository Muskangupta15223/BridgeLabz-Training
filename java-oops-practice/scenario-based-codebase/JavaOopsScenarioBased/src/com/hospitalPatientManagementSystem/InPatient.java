package com.hospitalPatientManagementSystem;

public class InPatient extends Patient{
	int roomNumber;
	int stayDays;
	InPatient(int patientId, String patientName, int age, String disease, int roomNumber, int stayDays) {
		super(patientId, patientName, age, disease);
		this.roomNumber = roomNumber;
	}
	
	public void displayInfo() {
		System.out.println("Name" + patientName + "\n Id " + patientId + " \n roomNumber: "+ roomNumber + "\n number of staysDays" + stayDays);
	}
	
}
