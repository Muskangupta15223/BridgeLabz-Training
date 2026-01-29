package CSVDataHandling;
import java.util.*;
import java.io.*;

public class GenerateCSVReportDatabase {
	
	static class Employee {
		private int id;
		private String name;
		private String department;
		private double salary;

		public Employee(int id, String name, String department, double salary) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getDepartment() {
			return department;
		}

		public double getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {
		String csvFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\employee_report.csv";
		List<Employee> employees = fetchEmployeeDataFromDatabase();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath))) {
			bw.write("Employee ID,Name,Department,Salary");
			bw.newLine();

			for (Employee emp : employees) {
				bw.write(emp.getId() + "," + emp.getName() + "," + emp.getDepartment() + "," + emp.getSalary());
				bw.newLine();
			}

			System.out.println("CSV report generated successfully at: " + csvFilePath);

		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	private static List<Employee> fetchEmployeeDataFromDatabase() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Abhijeet sigh", "HR", 60000));
		employees.add(new Employee(2, "Shna Gurjar", "IT", 75000));
		employees.add(new Employee(3, "Anuj Vishwakarma", "Finance", 80000));
		return employees;
	}

}
