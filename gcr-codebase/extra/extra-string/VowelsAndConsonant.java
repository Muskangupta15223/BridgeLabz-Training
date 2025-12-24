import java.util.*;
public class VowelsAndConsonant{
	
	public static int[] countVowelAndConsonant(String s){
		int countV = 0 , countC = 0;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				countV++;
			}else{
				countC++;
			}
		}
		return new int[] {countV , countC };
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter the string : ");
		int[] res = countVowelAndConsonant(str.toLowerCase());
		System.out.println("number of vowels and consonants are : " + Arrays.toString(res));
	}
}