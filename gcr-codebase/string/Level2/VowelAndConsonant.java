import java.util.Scanner;

public class VowelAndConsonant{

    // Method to check character type
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants using charAt()
    public static String[][] findVowelsAndConsonants(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] ans) {

        System.out.println("\nCharacter Type");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = findVowelsAndConsonants(text);
        displayResult(result);

        sc.close();
    }
}
