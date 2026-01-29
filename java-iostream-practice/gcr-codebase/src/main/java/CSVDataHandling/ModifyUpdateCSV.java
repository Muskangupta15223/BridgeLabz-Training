package CSVDataHandling;
import java.io.*;

public class ModifyUpdateCSV {

    public static void main(String[] args) {

        String inputFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
        String outputFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\updated_data.csv";
        String line;
        String splitBy = ",";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))
        ) {

            // Write header
            if ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Process rows
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] employee = line.split(splitBy);

                // SAFETY CHECK
                if (employee.length < 4) continue;

                String department = employee[2].trim();
                String salaryStr = employee[3].trim();

                if (!salaryStr.matches("\\d+(\\.\\d+)?")) {
                    continue;
                }

                double salary = Double.parseDouble(salaryStr);

                if (department.equalsIgnoreCase("IT")) {
                    salary *= 1.10; // 
                    employee[3] = String.format("%.2f", salary);
                }

                bw.write(String.join(",", employee));
                bw.newLine();
            }

            System.out.println("CSV file updated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
