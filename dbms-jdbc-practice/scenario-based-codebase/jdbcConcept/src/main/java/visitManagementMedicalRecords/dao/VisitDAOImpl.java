package visitManagementMedicalRecords.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import patientManagement.util.DBConnection;
import visitManagementMedicalRecords.model.Prescription;
import visitManagementMedicalRecords.model.Visit;

public class VisitDAOImpl implements VisitDAO {
	@Override
	public int recordVisit(Visit visit) {

    String insertVisit = "INSERT INTO visits(appointment_id,diagnosis,notes,visit_date) VALUES(?,?,?,?)";
    String updateAppointment = "UPDATE appointments SET status='COMPLETED' WHERE id=?";

    try(Connection con = DBConnection.getConnection()) {

        con.setAutoCommit(false);

        PreparedStatement visitPs =
                con.prepareStatement(insertVisit, Statement.RETURN_GENERATED_KEYS);

        visitPs.setInt(1, visit.getAppointmentId());
        visitPs.setString(2, visit.getDiagnosis());
        visitPs.setString(3, visit.getNotes());
        visitPs.setDate(4, Date.valueOf(visit.getVisitDate()));

        visitPs.executeUpdate();

        ResultSet rs = visitPs.getGeneratedKeys();
        rs.next();
        int generatedVisitId = rs.getInt(1);

        PreparedStatement updatePs = con.prepareStatement(updateAppointment);
        updatePs.setInt(1, visit.getAppointmentId());
        updatePs.executeUpdate();

        con.commit();

        return generatedVisitId;

    } catch(Exception e){
        e.printStackTrace();
    }

    return -1;
}


	@Override
	public void viewPatientMedicalHistory(int patientId) {

		String sql = "SELECT v.id, v.diagnosis, v.visit_date, p.medicine_name, p.dosage " + "FROM visits v "
				+ "JOIN appointments a ON v.appointment_id=a.id " + "JOIN prescriptions p ON v.id=p.visit_id "
				+ "WHERE a.patient_id=? " + "ORDER BY v.visit_date DESC";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, patientId);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("VisitID: " + rs.getInt("id") + " | Diagnosis: " + rs.getString("diagnosis")
						+ " | Date: " + rs.getDate("visit_date") + " | Medicine: " + rs.getString("medicine_name")
						+ " | Dosage: " + rs.getString("dosage"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addPrescriptionsBatch(List<Prescription> prescriptions) {

		String sql = "INSERT INTO prescriptions(visit_id,medicine_name,dosage,duration) VALUES(?,?,?,?)";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			for (Prescription p : prescriptions) {
				ps.setInt(1, p.getVisitId());
				ps.setString(2, p.getMedicineName());
				ps.setString(3, p.getDosage());
				ps.setString(4, p.getDuration());
				ps.addBatch();
			}

			ps.executeBatch();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
