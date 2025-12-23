import java.util.Scanner;

public class StringLen {

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access each character
                count++;
            }
        } catch (Exception e) {
            // When charAt() exceeds index, exception occurs
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        // Using user-defined method
        int customLength = getStringLength(str);
        System.out.println("Length of string (without length()): " + customLength);

        // Using built-in length() method
        int builtInLength = str.length();
        System.out.println("Length of string (using length()): " + builtInLength);

        sc.close();
    }
}
