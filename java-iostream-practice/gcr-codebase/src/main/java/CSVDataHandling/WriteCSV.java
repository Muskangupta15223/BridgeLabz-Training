package CSVDataHandling;
import java.io.*;
import java.util.*;

public class WriteCSV {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 List<String[]> employees = new ArrayList<>();
		 employees.add(new String[] {"ID", "Name", "Department", "Salary"});
		 employees.add(new String[] {"1", "Anuj Vishwakarma", "HR", "60000"});
		 employees.add(new String[] {"2", "Harsh Baklo", "IT", "75000"});
		 employees.add(new String[] {"3", "Muskan Gupta", "Finance", "70000"});
		 employees.add(new String[] {"4", "Aryan Bhorkar", "Marketing", "65000"});
		 employees.add(new String[] {"5", "Rudra Sharma", "Operations", "72000"});
		 
		 try {
			 BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
			 
			 for (String[] employee : employees) {
				 String line = String.join(",", employee);
				 bw.write(line);
				 bw.newLine();
			 }
			 
			 bw.close();
			 System.out.println("Data written to " + filePath);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
