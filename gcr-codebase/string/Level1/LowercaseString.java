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

	public static boolean comparison(String s, String t){
		t = t.toLowerCase();
		return s.equals(t);
	}
		
	public static void main(String args[]){
		// take string as input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s= convertToLowercase(str);		
		System.out.println(comparison(s,str));
		}
}