package JSONData;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterJson {

    public static void main(String[] args) throws Exception {

        String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\java\\JSONData\\Student.json";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File(filePath));

        for (JsonNode node : root) {
            int age = node.get("age").asInt();

            if (age > 22) {
                System.out.println(node.toPrettyString());
            }
        }
    }
}

