import java.util.*;

public class IllegalArgumentEx{

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println(result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = input.nextLine();

        try {
            generateException(text);
        } 
        catch (Exception e) {
            System.out.println("Exception occurred : ");
            handleException(text);
        }
        input.close();
    }
}