package visitManagementMedicalRecords;

import visitManagementMedicalRecords.dao.VisitDAOImpl;
import visitManagementMedicalRecords.model.Prescription;
import visitManagementMedicalRecords.model.Visit;

import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		VisitDAOImpl dao = new VisitDAOImpl();

		Visit visit = new Visit();
		visit.setAppointmentId(4);
		visit.setDiagnosis("Fever");
		visit.setNotes("Rest for 3 days");
		visit.setVisitDate(LocalDate.now());

		int visitId = dao.recordVisit(visit);

		if (visitId == -1) {
			System.out.println("Visit insertion failed");
			return;
		}

		dao.viewPatientMedicalHistory(1);

		List<Prescription> list = new ArrayList<>();

		Prescription p1 = new Prescription();
		p1.setVisitId(visitId);
		p1.setMedicineName("Paracetamol");
		p1.setDosage("500mg");
		p1.setDuration("5 days");

		list.add(p1);

		dao.addPrescriptionsBatch(list);
	}
}
