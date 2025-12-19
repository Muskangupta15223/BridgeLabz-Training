import java.util.*;
//creating class for finding bonus amount of employee
public class BonusToEmployee{
	public static void main(String args[]){
		//Taking salary and yearOfService as input from user 
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt(); 
		int yearOfService = sc.nextInt();

		// condition is true then we got bonus otherwise not
		if(yearOfService > 5){
			int bonusAmount = (salary * 5)/100;
			System.out.println("Bonus Amount is : " + bonusAmount); 
		}
	}
}