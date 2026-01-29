package CSVDataHandling;
import java.util.*;
import java.io.*;

public class ReadPrintCSV {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));

			 if ((line = br.readLine()) != null) {
				 String[] headers = line.split(",");
				 System.out.printf("%-5s %-20s %-10s %-10s%n", headers[0], headers[1], headers[2], headers[3]);
			 }
			 
			 while ((line = br.readLine()) != null) {
				 String[] student = line.split(",");
				 System.out.printf("%-5s %-20s %-10s %-10s%n", student[0], student[1], student[2], student[3]);
			 }
			 br.close();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}
