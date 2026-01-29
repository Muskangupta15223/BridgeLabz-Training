package CSVDataHandling;

import java.util.*;
import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonToCSVviceVersa {

    public static void main(String[] args) {

        String jsonFilePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.json";
        String csvFilePath  = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(jsonFilePath));
            StringBuilder sb = new StringBuilder();
            String line;

            while((line = br.readLine()) != null){
                sb.append(line);
            }
            br.close();

            JSONArray jsonArray = new JSONArray(sb.toString());

            FileWriter fw = new FileWriter(csvFilePath);

            JSONObject firstObj = jsonArray.getJSONObject(0);
            Set<String> keys = firstObj.keySet();

            for(String key : keys){
                fw.append(key).append(",");
            }
            fw.append("\n");

            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject obj = jsonArray.getJSONObject(i);

                for(String key : keys){
                    fw.append(obj.get(key).toString()).append(",");
                }
                fw.append("\n");
            }

            fw.flush();
            fw.close();

            System.out.println("JSON successfully converted to CSV");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
