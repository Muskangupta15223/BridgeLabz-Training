import java.util.*;
public class ReverseString{

	public String reverse(String str){
		String s = ""; 
		for(int i = str.length() -1; i >= 0; i--){
			s += str.charAt(i);
		}
		return s;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter the string : ");

		 ReverseString r = new ReverseString();
		System.out.println( r.reverse(str));


	}
}