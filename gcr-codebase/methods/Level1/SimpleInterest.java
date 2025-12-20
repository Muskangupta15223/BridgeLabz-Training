import java.util.*;
public class SimpleInterest{

	// create a method name CalculateSI for calculating the simple interest
	public static double calculateSI(double p, double r, double t){
		double si = ( p * r * t ) / 100;
		return si;
	}
	public static void main(String args[]){
		// Taking input principal, rate, time from user
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();

		// create object si and call the method calculateSI
		SimpleInterest si = new SimpleInterest();
		System.out.println("The Simple Interest is " +
si.calculateSI(principal,rate,time) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}