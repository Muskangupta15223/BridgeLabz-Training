import java.util.*;
public class CompareCharAt{
	public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //end
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);
        char[] result = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[index++] = current;
            }
        }
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = result[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}