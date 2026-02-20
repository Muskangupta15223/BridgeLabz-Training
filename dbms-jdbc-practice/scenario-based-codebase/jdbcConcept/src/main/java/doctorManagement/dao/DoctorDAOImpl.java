package doctorManagement.dao;

import java.sql.*;

import doctorManagement.model.Doctor;
import patientManagement.util.DBConnection;

public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public boolean addDoctor(Doctor d) {

        String sql = "INSERT INTO doctors(name,contact,consultation_fee,specialty_id) VALUES(?,?,?,?)";

        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, d.getName());
            ps.setString(2, d.getContact());
            ps.setDouble(3, d.getConsultationFee());
            ps.setInt(4, d.getSpecialtyId());

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateDoctorSpecialty(int doctorId, int specialtyId) {

        String sql = "UPDATE doctors SET specialty_id=? WHERE id=?";

        try(Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, specialtyId);
            ps.setInt(2, doctorId);

            ps.executeUpdate();
            con.commit();

            return true;

        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void getDoctorsBySpecialty(String specialtyName) {

        String sql = "SELECT d.name, d.contact, d.consultation_fee " +
                     "FROM doctors d " +
                     "JOIN specialties s ON d.specialty_id = s.id " +
                     "WHERE s.name=? AND d.is_active=true";

        try(Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, specialtyName);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(
                        rs.getString("name") + " | " +
                        rs.getString("contact") + " | " +
                        rs.getDouble("consultation_fee")
                );
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean deactivateDoctor(int doctorId) {

        String checkSql = "SELECT COUNT(*) FROM appointments " +
                          "WHERE doctor_id=? AND date > CURRENT_DATE";

        String updateSql = "UPDATE doctors SET is_active=false WHERE id=?";

        try(Connection con = DBConnection.getConnection()) {

            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setInt(1, doctorId);

            ResultSet rs = checkPs.executeQuery();
            rs.next();

            if(rs.getInt(1) > 0) {
                System.out.println("Doctor has future appointments!");
                return false;
            }

            PreparedStatement updatePs = con.prepareStatement(updateSql);
            updatePs.setInt(1, doctorId);

            return updatePs.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
