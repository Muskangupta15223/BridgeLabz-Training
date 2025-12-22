import java.util.*;
public class CompareString{
	
	// create method to compare string using char At
	public boolean isEqual(String s, String t){
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != t.charAt(i)) return false;
		}
		return true;
	}

	// using built in method
	public boolean isEqualBuilt(String s, String t){
		return s.equals(t);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();

		CompareString c = new CompareString();
		System.out.println("Using charAt : " + c.isEqual(str,str2));
		System.out.println("using Built in : " + c.isEqualBuilt(str,str2));
	}
}