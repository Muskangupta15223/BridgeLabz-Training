import java.util.*;
public class UppercaseString{
	//create method to convert String in uppercase
	public static String convertToUppercase(String s){
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
			ch[i] = (char) (ch[i] - 32);
			}
		}
		return new String(ch);
	}

	public static void main(String args[]){
		// take string as input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		//display output
		System.out.println("convert string to upper case without using built-in " + convertToUppercase(str));	
		System.out.println("convert string to upper case using built-in " + str.toUpperCase());	
	}
}