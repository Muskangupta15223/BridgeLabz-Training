import java.util.*;
//Creating FindDistance class for converting distance in yard and miles.
public class FindDistance{
	public static void main(String args[]){
		// Taking distanceInFeet as input from user
		Scanner sc = new Scanner(System.in);
		double distanceInFeet = sc.nextInt();
		
		//Calculating distance in yard and miles
		double distanceInYard = distanceInFeet / 3;
		double distanceInMiles = distanceInYard / 1760 ;
		
		//display distance in yard and miles
		System.out.println("The distance in yards is "+ distanceInYard + " while the distance in miles is "+ distanceInMiles);




	}
}