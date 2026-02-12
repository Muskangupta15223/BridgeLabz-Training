package com.jdbcPractice.CRUDOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbcPractice.BasicConnection;

public class UpdateData {

	public static void updateStudentData(int id, String name, String email) {
		String query = "Update Students SET Name = ?, email = ? where id = ?";
		
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(query)){
			stmt.setString(1, name);
			stmt.setString(2,email);
			stmt.setInt(3, id);
			
			int rowsAffected = stmt.executeUpdate();
			if(rowsAffected > 0) {
				System.out.println("Updated succesffully");
			}else {
				System.out.println("not successfully");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id , name and email ");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String email = sc.nextLine();
		
		updateStudentData(id,name,email);
		
	}
}
