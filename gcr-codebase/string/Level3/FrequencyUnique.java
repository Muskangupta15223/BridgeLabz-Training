import java.util.Scanner;

public class FrequencyUnique {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index++] = current;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency using unique characters
    public static String[][] characterFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] output = characterFrequency(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " : " + output[i][1]);
        }

        sc.close();
    }
}
