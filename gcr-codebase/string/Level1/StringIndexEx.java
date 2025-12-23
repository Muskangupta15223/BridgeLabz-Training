import java.util.*;
public class StringIndexEx{
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String string) {
        System.out.println(string.charAt(string.length()));
    }

     // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String string) {
        try {
            generateException(string);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error occurred and error message is: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String string = input.next();
        System.out.println("Demonstration of e StringIndexOutOfBoundsException");
        try{
           generateException(string);
        }
        catch (StringIndexOutOfBoundsException e) {
          handleException(string);
        }
    }
}