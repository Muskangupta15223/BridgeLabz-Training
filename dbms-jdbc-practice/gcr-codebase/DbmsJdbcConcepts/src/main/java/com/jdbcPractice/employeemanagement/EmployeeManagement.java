package com.jdbcPractice.employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbcPractice.BasicConnection;

public class EmployeeManagement {
	
	public static void menu(int n) {
	    Scanner sc = new Scanner(System.in);

	    if (n == 1) {
	        System.out.println("Enter name:");
	        String name = sc.nextLine();
	        System.out.println("Enter salary:");
	        int salary = sc.nextInt();
	        addEmployee(name, salary);

	    } else if (n == 2) {
	        getAllEmployee();

	    } else if (n == 3) {
	        System.out.println("Enter Employee ID:");
	        int id = sc.nextInt();
	        System.out.println("Enter new salary:");
	        int salary = sc.nextInt();
	        updateEmployee(id, salary);

	    } else if (n == 4) {
	        System.out.println("Enter Employee ID to delete:");
	        int id = sc.nextInt();
	        deleteEmployee(id);

	    } else if (n == 5) {
	        sc.nextLine(); // clear buffer
	        System.out.println("Enter name to search:");
	        String name = sc.nextLine();
	        searchEmployeeByName(name);
	    }
	}

	
	public static void addEmployee(String name, int salary) {
		String query = "Insert into Employee(name,salary) values(?,?) ";
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(query)){
			
			stmt.setString(1,name);
			stmt.setInt(2,salary);
			int rowAffected = stmt.executeUpdate();
			System.out.println(rowAffected);
		}catch(SQLException e) {
			System.out.println("SQL exception");
		}
				
	}
	public static void getAllEmployee() {
		String query = "Select * from Employee";
		try(Connection conn = BasicConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()){
			while(rs.next()) {
			     System.out.println(
		                    rs.getInt("id") + " | " +
		                    rs.getString("name")+ " | " +
		                    rs.getInt("salary")
		            );
			}
			System.out.println();
		}catch(SQLException e) {
			System.out.println("sql exception");
		}
	}
	
	public static void updateEmployee(int id , int salary) {
		String query = "Update Employee SET salary = ? where id = ?";
		try(Connection conn = BasicConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query)){
	        stmt.setInt(1, salary);
	        stmt.setInt(2, id);

	        int rows = stmt.executeUpdate();

	        if (rows > 0) {
	            System.out.println("Employee salary updated successfully.");
	        } else {
	            System.out.println("Employee not found.");
	        }
		}catch(SQLException e){
			System.out.println("sql exception");
		}
	}
	
	public static void deleteEmployee(int id) {
	    String query = "DELETE FROM Employee WHERE id = ?";

	    try (Connection conn = BasicConnection.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query)) {

	        stmt.setInt(1, id);

	        int rows = stmt.executeUpdate();

	        if (rows > 0) {
	            System.out.println("Employee deleted successfully.");
	        } else {
	            System.out.println("Employee not found.");
	        }

	    } catch (SQLException e) {
	        System.out.println("SQL exception");
	    }
	}
	
	public static void searchEmployeeByName(String name) {
	    String query = "SELECT * FROM Employee WHERE name LIKE ?";

	    try (Connection conn = BasicConnection.getConnection();
	         PreparedStatement stmt = conn.prepareStatement(query)) {

	        stmt.setString(1, "%" + name + "%");

	        ResultSet rs = stmt.executeQuery();

	        boolean found = false;

	        while (rs.next()) {
	            found = true;
	            System.out.println(
	                    rs.getInt("id") + " | " +
	                    rs.getString("name") + " | " +
	                    rs.getInt("salary")
	            );
	        }

	        if (!found) {
	            System.out.println("No employee found.");
	        }

	    } catch (SQLException e) {
	        System.out.println("SQL exception");
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 1;
		while(option != 6) {
		    System.out.println("1. Add Employee");
		    System.out.println("2. Get All Employees");
		    System.out.println("3. Update Employee Salary");
		    System.out.println("4. Delete Employee");
		    System.out.println("5. Search Employee By Name");
		    System.out.println("6. Exit");

		    option = sc.nextInt();
		    menu(option);
		}
		System.out.println("Program ended successfully!!");

	}
}
