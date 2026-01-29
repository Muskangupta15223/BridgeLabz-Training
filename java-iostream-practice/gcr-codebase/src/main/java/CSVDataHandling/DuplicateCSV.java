package CSVDataHandling;
import java.util.*;
import java.io.*;

public class DuplicateCSV {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		Set<String> ids = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				String id = values[0];

				if (!ids.add(id)) {
					duplicates.add(line);
				}
			}

			if (duplicates.isEmpty()) {
				System.out.println("No duplicate");
			} else {
				System.out.println("Duplicate Records:");
				for (String record : duplicates) {
					System.out.println(record);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
