package com.jdbcPractice.CRUDOperations;

import java.sql.*;

import com.jdbcPractice.BasicConnection;

public class ReadData {

	public static void getAllStudents() {
		String sql = "SELECT * FROM students";

		try (Connection conn = BasicConnection.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {

			System.out.println("ID\tName\t\tEmail\t\t\t Age\t Grade");
			System.out.println("----------------------------------------------------------------");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");

				System.out.printf("%d | %-17s| %-25s| %d\t| %s\t | \t%n", id, name, email, age, grade);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getAllStudents();
		System.out.println("\n");
		}
}
