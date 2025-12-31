package com.objectmodelling.levelOne.hospitalManagement;
import java.util.*;

public class Hospital {
    String hospitalName;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}
