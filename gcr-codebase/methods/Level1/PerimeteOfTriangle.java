import java.util.*;
public class PerimeteOfTriangle{	
//Create a method calculateRounds for finding round of triangular park
	public static double calculateRounds(double s1, double s2, double s3){			double perimeter = s1 + s2 + s3; 
		double totalDistance = 5000;
		double rounds = totalDistance / perimeter;
		return rounds;
	}
	public static void main(String args[]){	
		//take side of triangle as input from user
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		double rounds = calculateRounds(side1, side2, side3);

		System.out.println("the total rounds are: " + rounds);
	}
}