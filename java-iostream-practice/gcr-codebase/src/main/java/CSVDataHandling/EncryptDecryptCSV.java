package CSVDataHandling;

import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {

    public static void main(String[] args) {

        String inputFile = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
        String encryptedFile = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\encrypted_data.csv";
        String decryptedFile = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\decrypted_data.csv";

        encryptCSV(inputFile, encryptedFile);
        decryptCSV(encryptedFile, decryptedFile);
    }

    // 🔐 Encrypt CSV (Base64 Encode)
    private static void encryptCSV(String input, String output) {
        try (
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                // Header skip
                if (line.toLowerCase().startsWith("id")) {
                    bw.write(line);
                    bw.newLine();
                    continue;
                }

                String[] values = line.split(",");

                // Column safety check
                if (values.length >= 4) {
                    values[2] = Base64.getEncoder()
                            .encodeToString(values[2].getBytes());

                    values[3] = Base64.getEncoder()
                            .encodeToString(values[3].getBytes());
                }

                bw.write(String.join(",", values));
                bw.newLine();
            }

            System.out.println("CSV Encryption Completed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 🔓 Decrypt CSV (Base64 Decode)
    private static void decryptCSV(String input, String output) {
        try (
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().startsWith("id")) {
                    bw.write(line);
                    bw.newLine();
                    continue;
                }

                String[] values = line.split(",");

                if (values.length >= 4) {
                    values[2] = new String(
                            Base64.getDecoder().decode(values[2])
                    );

                    values[3] = new String(
                            Base64.getDecoder().decode(values[3])
                    );
                }

                bw.write(String.join(",", values));
                bw.newLine();
            }

            System.out.println("CSV Decryption Completed");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
