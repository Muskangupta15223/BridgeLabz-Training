import java.util.*;
// create class LeapYear for finding year is leap year or not
public class LeapYear{
	public static void main(String args[]){ 	
		//Taking year as input from user
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// condition of year according to Gregorian calendar
		if(year >= 1582){
			
			// using condition for finding year is leap year or not
			if(year % 400 == 0){
				System.out.println("Leap Year");
			}else if(year % 4 == 0 && year % 100 != 0){
				System.out.println("Leap Year");
			}else{
				System.out.println("Not a Leap Year");
			} 

		}else{
			System.out.println("Not Valid for Leap Year program");
		}
	}
}	
