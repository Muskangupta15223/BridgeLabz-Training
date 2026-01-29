package JSONData;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class JsonToXml {

    public static void main(String[] args) {

        try {
            File jsonFile = new File("D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\java\\JSONData\\Student.json");
            File xmlFile  = new File("D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\java\\JSONData\\Student.xml");

            ObjectMapper jsonMapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            JsonNode jsonNode = jsonMapper.readTree(jsonFile);

            ObjectNode root = jsonMapper.createObjectNode();
            root.set("Students", jsonNode);

            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);

            xmlMapper.writeValue(xmlFile, root);

            System.out.println("JSON successfully converted to XML");
            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
