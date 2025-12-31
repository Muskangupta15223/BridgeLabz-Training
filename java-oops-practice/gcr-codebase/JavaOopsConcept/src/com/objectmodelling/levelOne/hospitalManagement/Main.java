package com.objectmodelling.levelOne.hospitalManagement;
import java.util.*;
public class Main {
	    public static void main(String[] args) {

	        Hospital hospital = new Hospital("City Hospital");

	        Doctor drRam = new Doctor("Dr. Ram");
	        Doctor drShyam = new Doctor("Dr. Shyam");

	        Patient p1 = new Patient("Amit");
	        Patient p2 = new Patient("Neha");

	        hospital.addDoctor(drRam);
	        hospital.addDoctor(drShyam);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        drRam.consult(p1);
	        drRam.consult(p2);
	        drShyam.consult(p1);
	    }
	}

