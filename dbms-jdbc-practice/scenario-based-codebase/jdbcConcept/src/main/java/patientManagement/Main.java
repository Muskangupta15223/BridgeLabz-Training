package patientManagement;


import java.time.LocalDate;

import patientManagement.model.Patient;
import patientManagement.service.PatientService;

public class Main {

    public static void main(String[] args) {

        PatientService service = new PatientService();

        Patient p = new Patient();
        p.setName("Shna");
        p.setDob(LocalDate.of(2000,1,19));
        p.setPhone("9876543210");
        p.setEmail("shna@gmail.com");
        p.setAddress("Pune");
        p.setBloodGroup("B+");

        service.register(p);
    }
}
