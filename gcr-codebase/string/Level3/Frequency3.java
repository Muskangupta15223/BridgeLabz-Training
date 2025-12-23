import java.util.Scanner;

public class Frequency3 {

    // Method to find character frequency and return 2D array
    public static String[][] findFrequency(String text) {
	    int[] freq = new int[256];
            for (int i = 0; i < text.length(); i++) {
            	char ch = text.charAt(i);
            	freq[ch]++;
            }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark counted
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] < 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(-freq[ascii]);
                freq[ascii] = 0; // reset to avoid duplication
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] output = findFrequency(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " : " + output[i][1]);
        }

        sc.close();
    }
}
