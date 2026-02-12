package com.jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnection {
// Database credentials
//	private static final String URL = "jdbc:mysql://localhost:3306/ sample_db";
private static final String URL = "jdbc:mysql://localhost:3306/ employeemanagement";
private static final String USER = "root";

	public static Connection getConnection() {
		Connection connection = null;
		try {

// Establish connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database connected successfully!");

		}
		catch (SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		Connection conn = getConnection();
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
