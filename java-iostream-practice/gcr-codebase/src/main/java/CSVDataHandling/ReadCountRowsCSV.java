package CSVDataHandling;
import java.io.*;
import java.util.*;

public class ReadCountRowsCSV {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 int rowCount = 0;
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 // read and skipped
			 }
			 
			 while ((line = br.readLine()) != null) {
				 rowCount++;
			 }
			 br.close();
			 
			 System.out.println("number rows (excluding header): " + rowCount);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
