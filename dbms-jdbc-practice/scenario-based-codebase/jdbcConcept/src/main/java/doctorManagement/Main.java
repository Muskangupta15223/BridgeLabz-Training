package doctorManagement;

import doctorManagement.dao.DoctorDAO;
import doctorManagement.dao.DoctorDAOImpl;
import doctorManagement.model.Doctor;

public class Main {

    public static void main(String[] args) {

        DoctorDAO dao = new DoctorDAOImpl();

        Doctor d = new Doctor();
        d.setName("Dr. Sharma");
        d.setContact("9876543210");
        d.setConsultationFee(500);
        d.setSpecialtyId(1);

        dao.addDoctor(d);

        dao.getDoctorsBySpecialty("Cardiology");

        dao.updateDoctorSpecialty(1, 2);

        dao.deactivateDoctor(1);
    }
}
