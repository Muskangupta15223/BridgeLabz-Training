package JSONData;
import java.util.*;
import java.io.*;

/* Convert a list of Java objects into a JSON array. */
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJson {
	
	public static class Student {
	    private String name;
	    private int age;
	    private String email;

	    public Student(String name, int age, String email) {
	        this.name = name;
	        this.age = age;
	        this.email = email;
	    }

	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public String getEmail() { return email; }
	}


    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Krishna", 21, "krishna@gmail.com"));
        students.add(new Student("Rahul", 22, "rahul@gmail.com"));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

        System.out.println(jsonArray);
    }
}
