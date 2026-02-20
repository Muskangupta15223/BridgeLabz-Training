package visitManagementMedicalRecords.dao;

import java.util.List;

import visitManagementMedicalRecords.model.Prescription;
import visitManagementMedicalRecords.model.Visit;

public interface VisitDAO {

	int recordVisit(Visit visit);

	void viewPatientMedicalHistory(int patientId);

	boolean addPrescriptionsBatch(List<Prescription> prescriptions);
}
