package patientManagement.service;

import patientManagement.dao.PatientDAO;
import patientManagement.dao.PatientDAOImpl;
import patientManagement.model.Patient;

public class PatientService {

    private PatientDAO dao = new PatientDAOImpl();

    public void register(Patient p) {
        if(dao.registerPatient(p))
            System.out.println("Patient Registered");
        else
            System.out.println("Duplicate Patient");
    }
}
