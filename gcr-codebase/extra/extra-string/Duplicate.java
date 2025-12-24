import java.util.*;
public class Duplicate{

	public static String removeDuplicate(String s){
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(result.indexOf(ch) == -1) {
				result += ch;
            		}
        	}
        	return result;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("After Remove Duplicate : " + removeDuplicate(str));
	}
}