import java.util.Scanner;

public class NumberFormatEx {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println("\nGenerating NumberFormatException...");
        int num = Integer.parseInt(text);  // This will throw exception if input is non-numeric
        System.out.println("Parsed number: " + num); // Will not execute if exception occurs
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\nHandling NumberFormatException with try-catch...");
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught! Invalid number: " + text);
        } catch (RuntimeException e) {
            System.out.println("Other runtime exception caught: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to parse as integer: ");
        String input = sc.nextLine();

        // Call method that generates exception
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated: " + e);
        }

        // Call method that handles exception
        handleException(input);

        sc.close();
    }
}
