import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of string without using length()
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

    // Method to split text into words using charAt()
    public static String[] splitIntoWords(String text) {

        int len = getStringLength(text);
        int wordCount = 0;

        // Count words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' &&
                (i == 0 || text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else if (!temp.equals("")) {
                words[index++] = temp;
                temp = "";
            }
        }

        if (!temp.equals("")) {
            words[index] = temp;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word lengths
    public static int[] findShortestLongest(String[][] wordData) {

        if (wordData.length == 0) return new int[]{0, 0};

        int shortest = Integer.parseInt(wordData[0][1]);
        int longest = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);

            if (len < shortest) shortest = len;
            if (len > longest) longest = len;
        }

        return new int[]{shortest, longest};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] wordData = createWordLengthArray(words);
        int[] shortestLongest = findShortestLongest(wordData);

        System.out.println("\nShortest word length: " + shortestLongest[0]);
        System.out.println("Longest word length: " + shortestLongest[1]);

        sc.close();
    }
}
