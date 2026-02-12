package com.jdbcPractice.CRUDOperations;

import java.sql.*;
import java.util.Scanner;

import com.jdbcPractice.BasicConnection;

public class CreateDbAndTable {

	public static void insertStudent(String name, String email, int age, String grade) {
		String query = "INSERT INTO students (name, email, age, grade, enrollment_date) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = BasicConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4, grade);
			pstmt.setDate(5, new Date(System.currentTimeMillis()));
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) inserted successfully!");
		} catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of query you want to insert !!");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter age , name, email and grade ");
			int age = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			String grade = sc.next();

			insertStudent(name, email, age, grade);

			sc.close();
		}
	}
}
