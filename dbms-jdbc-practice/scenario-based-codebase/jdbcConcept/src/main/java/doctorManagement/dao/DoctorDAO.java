package doctorManagement.dao;

import doctorManagement.model.Doctor;

public interface DoctorDAO {

    boolean addDoctor(Doctor doctor);

    boolean updateDoctorSpecialty(int doctorId, int specialtyId);

    void getDoctorsBySpecialty(String specialtyName);

    boolean deactivateDoctor(int doctorId);
}
