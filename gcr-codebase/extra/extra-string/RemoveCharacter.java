import java.util.*;
public class RemoveCharacter{
	//create method to convert String in uppercase
	public static String removeSpecificChar(String s , char sym){
		String t =" ";
		char[] ch = s.toCharArray();
		for(int i = 0; i < s.length(); i++){
			if(sym == ch[i]){
				continue;
			}
			t += ch[i];
		}
		return t;	
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter a specific character");
		char ch = sc.next().charAt(0);
		System.out.println(removeSpecificChar(str,ch));
	}
}