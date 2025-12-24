import java.util.*;
public class ToggleCase{

	public static String convertCase(String s){
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
			ch[i] = (char) (ch[i] - 32);
			}else if (ch[i] >= 'A' && ch[i] <= 'Z') {
			ch[i] = (char) (ch[i] + 32);
			}
		}
		return new String(ch);
	}
	// Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(convertCase(s));
	}
}