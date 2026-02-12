package com.jdbcPractice.CRUDOperations;

import com.jdbcPractice.BasicConnection;
import java.sql.*;
import java.util.Scanner;

public class DeleteData {

	public static void deleteStudent(int id) {
		String query = "Delete from students where id = ?";

		try (Connection conn = BasicConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

			stmt.setInt(1, id);
			int rowAffected = stmt.executeUpdate();
			if (rowAffected > 0) {
				System.out.println("Deleted successfully");
			} else {
				System.out.println("not successful");
			}

		} catch (SQLException e) {
			System.out.println("SQL query Exception");
		}
	}

	public static boolean deleteStudentSafe(int studentId) {
		// First check if student exists
		String checkSql = "SELECT COUNT(*) FROM students WHERE id = ?";
		String deleteSql = "DELETE FROM students WHERE id = ?";

		try (Connection conn = BasicConnection.getConnection()) {
			// Check existence
			try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
				checkStmt.setInt(1, studentId);
				ResultSet rs = checkStmt.executeQuery();
				rs.next();
				if (rs.getInt(1) == 0) {
					System.out.println("Student not found!");
					return false;
				}
			}
			// Delete
			try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
				deleteStmt.setInt(1, studentId);
				deleteStmt.executeUpdate();
				System.out.println("Student deleted successfully!");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete row");
		int id = sc.nextInt();
		System.out.println("Enter id to delete row");
		int idSafe = sc.nextInt();
		deleteStudent(id);
		deleteStudentSafe(idSafe);

		sc.close();
	}
}
