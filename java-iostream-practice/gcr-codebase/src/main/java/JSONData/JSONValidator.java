package JSONData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JSONValidator {

    public static void main(String[] args) {

        String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.json";

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File(filePath));

            System.out.println("JSON is VALID");

        } catch (Exception e) {
            System.out.println("JSON is INVALID");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
