package JSONData;

import org.json.JSONArray;
import java.io.*;

public class MergeJSON {

    public static String readFile(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    public static void main(String[] args) {

        String json1Path = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\java\\JSONData\\Student.json";
        String json2Path = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.json";
        String outputPath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\merged.json";

        try {
            String json1Data = readFile(json1Path);
            String json2Data = readFile(json2Path);

            JSONArray arr1 = new JSONArray(json1Data);
            JSONArray arr2 = new JSONArray(json2Data);

            JSONArray mergedArray = new JSONArray();

            for(int i = 0; i < arr1.length(); i++){
                mergedArray.put(arr1.getJSONObject(i));
            }

            for(int i = 0; i < arr2.length(); i++){
                mergedArray.put(arr2.getJSONObject(i));
            }

            FileWriter fw = new FileWriter(outputPath);
            fw.write(mergedArray.toString(4));
            fw.flush();
            fw.close();

            System.out.println("JSON files merged");
            System.out.println("Output file: " + outputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
