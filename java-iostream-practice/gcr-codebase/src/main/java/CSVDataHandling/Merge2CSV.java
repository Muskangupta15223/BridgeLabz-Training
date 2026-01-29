package CSVDataHandling;
import java.util.*;
import java.io.*;

public class Merge2CSV {

	public static void main(String[] args) {
		String file1 = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		String file2 = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\student.csv";
		String outputFile = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\resources\\merged.csv";

		Map<String, String[]> studentData = new HashMap<>();

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
			String line;
			while ((line = br1.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					studentData.put(parts[0], new String[]{parts[1], parts[2]});
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File outFile = new File(outputFile);
		outFile.getParentFile().mkdirs();
		
		try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
			String line;
			while ((line = br2.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					String id = parts[0];
					if (studentData.containsKey(id)) {
						String[] existingData = studentData.get(id);
						studentData.put(id, new String[]{existingData[0], existingData[1], parts[1], parts[2]});
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
		    for (Map.Entry<String, String[]> entry : studentData.entrySet()) {
		        String[] d = entry.getValue();
		        if (d.length == 4) {
		            bw.write(entry.getKey() + "," + d[0] + "," + d[1] + "," + d[2] + "," + d[3]);
		            bw.newLine();
		        }
		    }
		}catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Merged data written to : " + outputFile);

	}

}
