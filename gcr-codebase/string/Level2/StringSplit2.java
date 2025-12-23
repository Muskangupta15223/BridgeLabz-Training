import java.util.Scanner;

public class StringSplit2 {

    // Method to get string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] customSplit(String text) {

        int len = getStringLength(text);

        // Count words
        int wordCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && (i == 0 || text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                if (i > 0 && text.charAt(i - 1) != ' ') {
                    if (index < spaceIndexes.length) {
                        spaceIndexes[index++] = i;
                    }
                }
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;
        index = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            String temp = "";
            for (int j = start; j < end; j++) {
                temp += text.charAt(j);
            }
            words[i] = temp;
            start = end + 1;
        }

        // Last word
        String temp = "";
        for (int j = start; j < len; j++) {
            temp += text.charAt(j);
        }
        words[wordCount - 1] = temp;

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split("\\s+");

        // Display custom split
        System.out.println("\nCustom Split Words:");
        for (String word : customWords) {
            System.out.println(word);
        }

        // Display built-in split
        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare the results
        boolean isEqual = compareStringArrays(customWords, builtInWords);
        System.out.println("\nDo both split methods produce the same result? " + isEqual);

        sc.close();
    }
}
