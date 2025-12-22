import java.util.*;
public class LowercaseString{
	//create method to convert String in uppercase
	public static String convertToLowercase(String s){
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
			ch[i] = (char) (ch[i] + 32);
			}
		}
		return new String(ch);
	}

	public static void main(String args[]){
		// take string as input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//display output
		System.out.println("convert string to LowerCase case without using built-in  : " + convertToLowercase(str));	
		System.out.println("convert string to Lowercase using built-in : " + str.toLowerCase());	
	}
}