import java.util.Scanner;

public class ReplaceWord {

    // Custom replace method
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            if (i + oldWord.length() <= sentence.length() &&
                sentence.substring(i, i + oldWord.length()).equals(oldWord)) {

                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        System.out.println("Updated Sentence: " +
                replaceWord(sentence, oldWord, newWord));
    }
}