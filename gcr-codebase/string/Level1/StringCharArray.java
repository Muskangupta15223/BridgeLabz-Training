import java.util.*;
public class StringCharArray{
	// create a method convert string to char array
	public static char[] convertToCharArray(String s){
		int size = s.length();
		char[] arr = new char[size];
		for(int i = 0; i < size; i++){
			arr[i] = s.charAt(i);
		}
		return arr;
	}

	public static boolean comparison(char[] s, String str){
		char[] t = str.toCharArray();
		return Arrays.equals(s,t);
		  
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//display output
		char[] ch = convertToCharArray(str);
		System.out.println("Compare character array by using built in & without using built in :  \n" + comparison(ch,str));

	}
}