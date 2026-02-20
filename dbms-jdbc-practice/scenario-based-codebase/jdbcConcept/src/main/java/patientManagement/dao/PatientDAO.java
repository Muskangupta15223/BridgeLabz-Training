package patientManagement.dao;

import java.util.List;

import patientManagement.model.Patient;

public interface PatientDAO {

    boolean registerPatient(Patient patient);
    boolean updatePatient(Patient patient);
    Patient getPatientById(int id);
    List<Patient> searchPatientByName(String name);
}
