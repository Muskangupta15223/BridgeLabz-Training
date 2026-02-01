package com.streamapi.doctoravailability;

public class Doctor {

	String name;
	String speciality;
	boolean isAvailableOnWeekends;
	
	Doctor(String name, String speciality, boolean isAvailableOnWeekends){
		this.name = name;
		this.speciality = speciality;
		this.isAvailableOnWeekends = isAvailableOnWeekends;
	}
	public boolean isAvailableOnWeekends() {
		return isAvailableOnWeekends;
	}
	@Override
	public String toString() {
		return name + " | Speciality: " + speciality + " | Available on Weekends: " + isAvailableOnWeekends + "\n" ;
	}
}
