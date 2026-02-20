package appointmentScheduling.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

import appointmentScheduling.model.Appointment;
import patientManagement.util.DBConnection;

public class AppointmentDAOImpl implements AppointmentDAO {
	@Override
	public boolean bookAppointment(Appointment ap) {

		String checkSql = "SELECT COUNT(*) FROM appointments "
				+ "WHERE doctor_id=? AND appointment_date=? AND appointment_time=? AND status='SCHEDULED'";

		String insertSql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) "
				+ "VALUES(?,?,?,?, 'SCHEDULED')";

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, ap.getDoctorId());
			checkPs.setDate(2, Date.valueOf(ap.getDate()));
			checkPs.setTime(3, Time.valueOf(ap.getTime()));

			ResultSet rs = checkPs.executeQuery();
			rs.next();

			if (rs.getInt(1) > 0) {
				System.out.println("Slot not available!");
				return false;
			}

			PreparedStatement ps = con.prepareStatement(insertSql);
			ps.setInt(1, ap.getPatientId());
			ps.setInt(2, ap.getDoctorId());
			ps.setDate(3, Date.valueOf(ap.getDate()));
			ps.setTime(4, Time.valueOf(ap.getTime()));

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void checkDoctorAvailability(int doctorId, String date) {

		String sql = "SELECT appointment_time, COUNT(*) as total " + "FROM appointments "
				+ "WHERE doctor_id=? AND appointment_date=? " + "GROUP BY appointment_time";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, doctorId);
			ps.setDate(2, Date.valueOf(date));

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getTime("appointment_time") + " → Booked: " + rs.getInt("total"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean cancelAppointment(int appointmentId) {

		String updateSql = "UPDATE appointments SET status='CANCELLED' WHERE id=?";
		String auditSql = "INSERT INTO appointment_audit(appointment_id,action) VALUES(?, 'CANCELLED')";

		try (Connection con = DBConnection.getConnection()) {

			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement(updateSql);
			ps.setInt(1, appointmentId);
			ps.executeUpdate();

			PreparedStatement auditPs = con.prepareStatement(auditSql);
			auditPs.setInt(1, appointmentId);
			auditPs.executeUpdate();

			con.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean rescheduleAppointment(int appointmentId, Appointment newAp) {

		String checkSql = "SELECT COUNT(*) FROM appointments "
				+ "WHERE doctor_id=? AND appointment_date=? AND appointment_time=? AND status='SCHEDULED'";

		String updateSql = "UPDATE appointments SET doctor_id=?, appointment_date=?, appointment_time=? WHERE id=?";

		try (Connection con = DBConnection.getConnection()) {

			con.setAutoCommit(false);

			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, newAp.getDoctorId());
			checkPs.setDate(2, Date.valueOf(newAp.getDate()));
			checkPs.setTime(3, Time.valueOf(newAp.getTime()));

			ResultSet rs = checkPs.executeQuery();
			rs.next();

			if (rs.getInt(1) > 0) {
				con.rollback();
				System.out.println("New slot not available!");
				return false;
			}

			PreparedStatement ps = con.prepareStatement(updateSql);
			ps.setInt(1, newAp.getDoctorId());
			ps.setDate(2, Date.valueOf(newAp.getDate()));
			ps.setTime(3, Time.valueOf(newAp.getTime()));
			ps.setInt(4, appointmentId);

			ps.executeUpdate();

			con.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void viewDailySchedule(String date) {

		String sql = "SELECT a.appointment_time, p.name AS patient, d.name AS doctor " + "FROM appointments a "
				+ "JOIN patients p ON a.patient_id=p.id " + "JOIN doctors d ON a.doctor_id=d.id "
				+ "WHERE a.appointment_date=? AND a.status='SCHEDULED' " + "ORDER BY a.appointment_time";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setDate(1, Date.valueOf(date));

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getTime("appointment_time") + " | " + rs.getString("patient") + " | "
						+ rs.getString("doctor"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
