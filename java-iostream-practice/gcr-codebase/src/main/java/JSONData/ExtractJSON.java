package JSONData;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;

public class ExtractJSON {

    public static void main(String[] args) {

        String filePath = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\java\\JSONData\\Student.json";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder jsonData = new StringBuilder();
            String line;

            while((line = br.readLine()) != null){
                jsonData.append(line);
            }
            br.close();

            JSONArray arr = new JSONArray(jsonData.toString());

            for(int i = 0; i < arr.length(); i++){
                JSONObject obj = arr.getJSONObject(i);

                String name = obj.getString("name");

                JSONArray coursesArray = obj.getJSONArray("courses");

                System.out.print("Name: " + name + ", Courses: ");

                for(int j = 0; j < coursesArray.length(); j++){
                    System.out.print(coursesArray.getString(j));

                    if(j < coursesArray.length()-1){
                        System.out.print(", ");
                    }
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
