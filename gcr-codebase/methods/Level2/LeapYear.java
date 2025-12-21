import java.util.*;
public class LeapYear{
	// create a method isLeapYear to check year is leap or not
	public String isLeapYear(int year){
		String res = "";
		if(year >= 1582){
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
				return "Leap Year";
			}
		}
		return "not a leap year";
	}
	public static void main(String args[]){ 	
		//Taking year as input from user
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		//create obj and call the methods
		LeapYear ly = new LeapYear();		
		System.out.println(ly.isLeapYear(year));
	}
}	
