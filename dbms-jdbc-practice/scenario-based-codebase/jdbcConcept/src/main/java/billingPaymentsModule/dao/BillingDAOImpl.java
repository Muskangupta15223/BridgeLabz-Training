package billingPaymentsModule.dao;

import java.sql.*;

import patientManagement.util.DBConnection;

public class BillingDAOImpl implements BillingDAO {

	@Override
	public int generateBill(int visitId, double additionalCharges) {

		String feeQuery = "SELECT d.consultation_fee " + "FROM visits v "
				+ "JOIN appointments a ON v.appointment_id=a.id " + "JOIN doctors d ON a.doctor_id=d.id "
				+ "WHERE v.id=?";

		String insertBill = "INSERT INTO bills(visit_id,total_amount) VALUES(?,?)";

		try (Connection con = DBConnection.getConnection()) {

			PreparedStatement feePs = con.prepareStatement(feeQuery);
			feePs.setInt(1, visitId);

			ResultSet rs = feePs.executeQuery();
			rs.next();

			double consultationFee = rs.getDouble(1);
			double total = consultationFee + additionalCharges;

			PreparedStatement billPs = con.prepareStatement(insertBill, Statement.RETURN_GENERATED_KEYS);

			billPs.setInt(1, visitId);
			billPs.setDouble(2, total);

			billPs.executeUpdate();

			ResultSet gen = billPs.getGeneratedKeys();
			gen.next();
			return gen.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public boolean recordPayment(int billId, String paymentMode) {

		String updateBill = "UPDATE bills SET payment_status='PAID', "
				+ "payment_date=CURDATE(), payment_mode=? WHERE id=?";

		String insertTxn = "INSERT INTO payment_transactions(bill_id,amount,mode) "
				+ "SELECT id,total_amount,? FROM bills WHERE id=?";

		try (Connection con = DBConnection.getConnection()) {

			con.setAutoCommit(false);

			PreparedStatement upPs = con.prepareStatement(updateBill);
			upPs.setString(1, paymentMode);
			upPs.setInt(2, billId);
			upPs.executeUpdate();

			PreparedStatement txnPs = con.prepareStatement(insertTxn);
			txnPs.setString(1, paymentMode);
			txnPs.setInt(2, billId);
			txnPs.executeUpdate();

			con.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void viewOutstandingBills() {

		String sql = "SELECT p.name, COUNT(b.id) total_bills, SUM(b.total_amount) total_due " + "FROM bills b "
				+ "JOIN visits v ON b.visit_id=v.id " + "JOIN appointments a ON v.appointment_id=a.id "
				+ "JOIN patients p ON a.patient_id=p.id " + "WHERE b.payment_status='UNPAID' " + "GROUP BY p.name";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("name") + " | Bills: " + rs.getInt("total_bills") + " | Due: "
						+ rs.getDouble("total_due"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generateRevenueReport(String startDate, String endDate) {

		String sql = "SELECT d.name, SUM(b.total_amount) revenue " + "FROM bills b "
				+ "JOIN visits v ON b.visit_id=v.id " + "JOIN appointments a ON v.appointment_id=a.id "
				+ "JOIN doctors d ON a.doctor_id=d.id " + "WHERE b.payment_status='PAID' "
				+ "AND b.payment_date BETWEEN ? AND ? " + "GROUP BY d.name " + "HAVING revenue > 0";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setDate(1, Date.valueOf(startDate));
			ps.setDate(2, Date.valueOf(endDate));

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("name") + " | Revenue: " + rs.getDouble("revenue"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
