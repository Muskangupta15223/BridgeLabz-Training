package CSVDataHandling;
import java.io.*;
import java.util.*;

public class ValidateCSVDataBeforeProcessing {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		 String phoneRegex = "^\\d{10}$";
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 // read and skip header
			 }
			 
			 int rowNum = 1;
			 while ((line = br.readLine()) != null) {
				 rowNum++;
				 String[] employee = line.split(splitBy);
				 String email = employee[2];
				 String phone = employee[3];
				 boolean valid = true;
				 
				 if (!email.matches(emailRegex)) {
					 System.out.println("Row " + rowNum + " has invalid email: " + email);
					 valid = false;
				 }
				 if (!phone.matches(phoneRegex)) {
					 System.out.println("Row " + rowNum + " has invalid phone number: " + phone);
					 valid = false;
				 }
				 if (valid) {
					 System.out.println("Row " + rowNum + " is valid.");
				 }
			 }
			 br.close();
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
