import java.util.Scanner;

public class StringTrim {

    // Method to find start and end index after trimming spaces
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = 0;

        // Find start index (first non-space)
        try {
            while (str.charAt(start) == ' ') {
                start++;
            }
        } catch (Exception e) {

        }

        // Find end index (last non-space)
        end = getStringLength(str) - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to find string length without length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    // Method to create substring from start to end using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (getStringLength(s1) != getStringLength(s2)) return false;
        for (int i = 0; i < getStringLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = getTrimIndices(input);
        String trimmedCustom = (indices[1] >= indices[0]) ? customSubstring(input, indices[0], indices[1]): " ";
	String trimmedBuiltIn = input.trim();
	
        System.out.println("\nCustom Trimmed String: '" + trimmedCustom + " ");
        System.out.println("Built-in Trimmed String: '" + trimmedBuiltIn + " ");

        boolean result = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("\nAre both strings equal? " + result);

	}
}
