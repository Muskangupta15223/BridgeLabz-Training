package CSVDataHandling;
import java.io.*;
import java.util.*;

public class CSVDataintoJavaObj {
	public static class Student {
		private int id;
		private String name;
		private String department;
		private double phone;
		
		public Student(int id, String name, String department, double phone) {
			this.id = id;
			this.name = name;
			this.department = department;
			this.phone = phone;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", department=" + department + ", phone=" + phone + "]";
		}
	}

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 List<Student> students = new ArrayList<>();
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 // read and skip
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] data = line.split(splitBy);
				 int id = Integer.parseInt(data[5]);
				 String name = data[3];
				 String department = data[4];
				 double phone = Double.parseDouble(data[2]);
				 
				 Student student = new Student(id, name, department, phone);
				 students.add(student);
			 }
			 br.close();
			 
			 for (Student s : students) {
				 System.out.println(s);
			 }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
