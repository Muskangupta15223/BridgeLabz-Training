import java.util.*;
public class LongestWord{
	//method to find longest word
	public static String findLongestWord(String str){
		String t = ""; 	
		String[] word = str.split(" ");
		int m = Integer.MIN_VALUE;
		for(String s : word){
			int count = s.length();
			if(count > m){
				m = count;
				t = s;
			}
		}
		return t;
	}
	// Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(findLongestWord(s));
	}
}