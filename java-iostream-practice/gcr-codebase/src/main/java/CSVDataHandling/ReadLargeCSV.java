package CSVDataHandling;
import java.util.*;
import java.io.*;

public class ReadLargeCSV {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		int chunkSize = 100;
		int recordCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			List<String> chunk = new ArrayList<>(chunkSize);

			while ((line = br.readLine()) != null) {
				chunk.add(line);
				if (chunk.size() == chunkSize) {
					recordCount += chunk.size();
					System.out.println("Processed records: " + recordCount);
					chunk.clear();
				}
			}

			if (!chunk.isEmpty()) {
				recordCount += chunk.size();
				System.out.println("Processed records: " + recordCount);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
