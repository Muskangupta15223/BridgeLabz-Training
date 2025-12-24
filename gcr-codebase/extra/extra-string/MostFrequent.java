import java.util.*;

public class MostFrequent{

    public static char mostFrequentCharacter(String str) {
        int[] freq = new int[256];
	for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Most frequent character: " + mostFrequentCharacter(input));
        sc.close();
    }
}
