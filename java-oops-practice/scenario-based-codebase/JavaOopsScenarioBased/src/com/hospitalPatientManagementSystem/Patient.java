package com.hospitalPatientManagementSystem;

public abstract class Patient {
	protected int patientId;
	protected String patientName;
	private int age;
	private String disease;
	private String medicalHistory;
    private Doctor assignedDoctor;
	
	Patient(int patientId, String patientName, int age, String disease){
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		setDisease(disease);
	}
	
	Patient(int patientId, String patientName, int age, String disease, String medicalHistory){
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		setDisease(disease);
		setMedicalHistory(medicalHistory);
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public String getSummary() {
		return disease + " : " +medicalHistory;
	}
	public void displayInfo() {
		System.out.println("Name : " + patientName + "\nId : " + patientId + "\nAge : " + age + "\ndisease : " + disease);
	}

	
}
