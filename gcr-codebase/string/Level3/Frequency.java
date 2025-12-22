import java.util.*;
public class Frequency{
	// create a method to find frequency of characters
	public static String[] findFrequency(String text) {
		char[] chars = text.toCharArray(); 
		int[] freq = new int[chars.length];  

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '0') {
				continue;
			}
			freq[i] = 1; 
			for (int j = i + 1; j < chars.length; j++) {
                		if (chars[i] == chars[j]) {
                    			freq[i]++;
                    			chars[j] = '0';
               			}
            		}
		}
		String[] result = new String[chars.length];
		int index = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != '0') {
			result[index] = chars[i] + " : " + freq[i];
			index++;
			}
		}

 		return result;
	}
	//main method
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
       		System.out.print("Enter a string: ");
        	String str = sc.nextLine();
		System.out.println("Frequencies:");
     		System.out.println(Arrays.toString(findFrequency(str)));

        	sc.close();
	}
}