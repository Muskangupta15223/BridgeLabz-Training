import java.util.*;
public class Pallindrome{
	public static boolean isPalindrome(String s){
		int n = s.length();
		for(int i = 0; i < n / 2; i++){
			if(s.charAt(i) != s.charAt(n-i-1)){
				return false;	
			}
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Is pallindrome: " + isPalindrome(str));


	}
}