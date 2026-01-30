package com.methodreference.hospitalpatient;

import java.util.*;
public class HospitalPatient {

	public static void main(String args[]) {

		List<Patient> patients = Arrays.asList(
				new Patient(101, "Krishna"),
				new Patient(102, "Soumya"),
				new Patient(103, "Muskan")
		);

		System.out.println("Patient IDs:");
		patients.stream()
		        .map(Patient::getId)
		        .forEach(System.out::println); 
		
	}
	
}
