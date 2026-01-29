package CSVDataHandling;
import java.io.*;

public class FilterCSVRecords {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\student.csv";
		 String line = "";
		 String splitBy = ",";
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 String[] headers = line.split(splitBy);
				 System.out.printf("%-10s %-20s %-5s%n", headers[0], headers[1], headers[2]);
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] student = line.split(splitBy);
				 int marks = Integer.parseInt(student[2]);
				 if (marks > 80) {
					 System.out.printf("%-10s %-20s %-5s%n", student[0], student[1], student[2]);
				 }
			 }
			 br.close();
		 } catch (IOException | NumberFormatException e) {
			 e.printStackTrace();
		 }
	}
}
