package patientManagement.dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import patientManagement.model.Patient;
import patientManagement.util.DBConnection;

public class PatientDAOImpl implements PatientDAO {

    @Override
    public boolean registerPatient(Patient p) {

        try(Connection con = DBConnection.getConnection()) {

            String check = "SELECT id FROM patients WHERE phone=? OR email=?";
            PreparedStatement checkPs = con.prepareStatement(check);
            checkPs.setString(1, p.getPhone());
            checkPs.setString(2, p.getEmail());

            ResultSet rs = checkPs.executeQuery();
            if(rs.next()) return false;

            String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setDate(2, Date.valueOf(p.getDob()));
            ps.setString(3, p.getPhone());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getAddress());
            ps.setString(6, p.getBloodGroup());

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updatePatient(Patient p) {

        try(Connection con = DBConnection.getConnection()) {

            String sql = "UPDATE patients SET name=?, address=?, blood_group=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setString(2, p.getAddress());
            ps.setString(3, p.getBloodGroup());
            ps.setInt(4, p.getId());

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Patient getPatientById(int id) {

        try(Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM patients WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPhone(rs.getString("phone"));
                return p;
            }

        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Patient> searchPatientByName(String name) {

        List<Patient> list = new ArrayList<>();

        try(Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM patients WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Patient p = new Patient();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPhone(rs.getString("phone"));
                list.add(p);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
