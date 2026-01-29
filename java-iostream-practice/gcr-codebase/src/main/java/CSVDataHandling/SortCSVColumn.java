package CSVDataHandling;
import java.io.*;
import java.util.*;

public class SortCSVColumn {

	public static void main(String[] args) {
		 String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		 String line = "";
		 String splitBy = ",";
		 
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(filePath));
			 
			 if ((line = br.readLine()) != null) {
				 // read and skip
			 }
			 
			 String[][] records = br.lines().map(l -> l.split(splitBy)).toArray(String[][]::new);
			 
			 Arrays.sort(records, (a, b) -> {
				 double salaryA = Double.parseDouble(a[3]);
				 double salaryB = Double.parseDouble(b[3]);
				 return Double.compare(salaryB, salaryA);
			 });
			 
			 System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Dept", "Salary");
			 for (int i = 0; i < Math.min(5, records.length); i++) {
				 String[] employee = records[i];
				 System.out.printf("%-10s %-20s %-10s %-10s%n", employee[0], employee[1], employee[2], employee[3]);
			 }
			 
			 br.close();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
