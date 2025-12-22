import java.util.*;
public class Anagram{

	// create a method to check Strings are Anagram or not
	public static boolean isAnagram(String s1 , String s2){
		if(s1.length() != s2.length()){
			return false;
		}
        int[] freq = new int[26];

        	for (int i = 0; i < s1.length(); i++) {
 			freq[s1.charAt(i) - 'a']++;
 			freq[s2.charAt(i) - 'a']--;
 		}

 		for (int i = 0; i < 26; i++) {
 			if (freq[i] != 0) {
                		return false;
			}
		}
		return true;
	}
	
	// Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("Is Anagram : " + isAnagram(s1,s2));
	}
}