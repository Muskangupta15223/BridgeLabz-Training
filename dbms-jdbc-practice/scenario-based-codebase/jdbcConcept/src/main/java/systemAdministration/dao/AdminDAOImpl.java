package systemAdministration.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import patientManagement.util.DBConnection;
import systemAdministration.model.Specialty;

public class AdminDAOImpl implements AdminDAO {
	@Override
	public boolean addSpecialty(Specialty s) {

		String sql = "INSERT INTO specialty(name) VALUES(?)";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, s.getName());
			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateSpecialty(int id, String newName) {

		String sql = "UPDATE specialty SET name=? WHERE id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, newName);
			ps.setInt(2, id);
			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteSpecialty(int id) {

		String checkSql = "SELECT COUNT(*) FROM doctors WHERE specialty_id=?";
		String deleteSql = "DELETE FROM specialty WHERE id=?";

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, id);

			ResultSet rs = checkPs.executeQuery();
			rs.next();

			if (rs.getInt(1) > 0) {
				System.out.println("Cannot delete. Specialty in use.");
				return false;
			}

			PreparedStatement delPs = con.prepareStatement(deleteSql);
			delPs.setInt(1, id);
			return delPs.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void backupDatabase() {

		try (Connection con = DBConnection.getConnection()) {

			DatabaseMetaData meta = con.getMetaData();
			String dbName = con.getCatalog();

			ResultSet tables = meta.getTables(dbName, null, "%", new String[] { "TABLE" });

			while (tables.next()) {

				String tableName = tables.getString("TABLE_NAME");

				System.out.println("Backing up table: " + tableName);

				Statement stmt = con.createStatement();
				ResultSet data = stmt.executeQuery("SELECT * FROM " + tableName);

				while (data.next()) {
					System.out.println("Row backed up from " + tableName);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void viewAuditLogs(String user, String tableName) {

		String sql = "SELECT * FROM audit_log " + "WHERE user_name=? AND table_name=? "
				+ "AND action_time >= NOW() - INTERVAL 7 DAY";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, user);
			ps.setString(2, tableName);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("user_name") + " | " + rs.getString("table_name") + " | "
						+ rs.getString("action_type") + " | " + rs.getTimestamp("action_time"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
