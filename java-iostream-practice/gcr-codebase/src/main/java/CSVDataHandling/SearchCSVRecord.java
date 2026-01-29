package CSVDataHandling;
import java.io.*;
public class SearchCSVRecord {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 String searchName = "Muskan Gupta";
		 boolean found = false;
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 // read and skip
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] employee = line.split(splitBy);
				 String name = employee[1];
				 if (name.equalsIgnoreCase(searchName)) {
					 String department = employee[2];
					 String salary = employee[3];
					 System.out.println("Employee Found: " + name);
					 System.out.println("Department: " + department);
					 System.out.println("Salary: " + salary);
					 found = true;
					 break;
				 }
			 }
			 br.close();
			 
			 if (!found) {
				 System.out.println("Employee " + searchName + " not found.");
			 }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
