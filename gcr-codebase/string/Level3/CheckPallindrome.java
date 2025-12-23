import java.util.*;

public class CheckPallindrome{	

	public static boolean isPalindromeLogic1(String str) {
        	int start = 0;
        	int end = str.length() - 1;
        	while (start < end) {
            		if (str.charAt(start) != str.charAt(end)) {
                		return false;
           		 }
            		start++;
           		end--;
		}
       		return true;
	}

	public static boolean isPalindromeLogic2(String t, int start, int end){        	
		if (start >= end) {
			return true;
		}
		if (t.charAt(start) != t.charAt(end)) {
			 return false;
		}

		return isPalindromeLogic2(t, start + 1, end - 1);
	}

	  public static char[] reverseString(String text) {
		char[] reverse = new char[text.length()];
		int index = 0;
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse[index++] = text.charAt(i);
		}
		return reverse;
	}

	public static boolean isPalindromeLogic3(String t) {
        	char[] original = t.toCharArray();
        	char[] reverse = reverseString(t);
		for(int i = 0; i < original.length; i++) {
			if (original[i] != reverse[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Logic 1 (Iterative): "+ (isPalindromeLogic1(str) ? "Palindrome": "Not Palindrome"));
		System.out.println("Logic 2 (Recursive): " + (isPalindromeLogic2(str, 0, str.length() - 1)? "Palindrome": "Not Palindrome"));
        	System.out.println("Logic 3 (Char Array): " + (isPalindromeLogic3(str)? "Palindrome": "Not Palindrome"));
	}
}