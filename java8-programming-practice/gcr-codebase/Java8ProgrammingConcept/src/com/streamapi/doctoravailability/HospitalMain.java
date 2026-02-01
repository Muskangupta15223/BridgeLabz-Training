package com.streamapi.doctoravailability;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalMain {

	public static void main(String args[]) {
		
		List<Doctor> doctors = Arrays.asList(
				new Doctor("Dr. Smith", "Cardiologist", true),
				new Doctor("Dr. Johnanath", "Dermatologist", false),
				new Doctor("Dr. Williams", "Pediatrician", true),
				new Doctor("Dr. Brown", "Neurologist", false),
				new  Doctor("Dr. Jones", "Orthopedic", true)
				);
		List<Doctor> availableDoctors = doctors.stream()
												.filter(doctor -> doctor.isAvailableOnWeekends)
												.sorted((d1, d2) -> d1.speciality.compareTo(d2.speciality))
												.collect(Collectors.toList());
		System.out.println("Doctors available on weekends:" + availableDoctors);
	}
}
