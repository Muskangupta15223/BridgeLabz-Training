import java.util.*;
public class LandUnitConverter{

	// create methods for unit conversions
	public static double convertYardsToFeet(double yards){
		return yards * 3;
	}

	public static double convertFeetToYards(double feet) {
        	return feet *  0.333333;
    	}
  
	public static double convertMetersToInches(double meters) {
        	return meters * 39.3701;
	}

	public static double convertInchesToMeters(double inches) {
        	return inches * 0.0254;
	}

	public static double convertInchesToCentimeters(double inches) {
		return inches * 2.54;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double yard = sc.nextDouble();	
		double feet = sc.nextDouble();		
		double meter = sc.nextDouble();		
		double inches = sc.nextDouble();	

		// display output
		System.out.println(" Conversion : ");
		System.out.println("yards to feet " + convertYardsToFeet(yard));
		System.out.println("feet to yards " + convertFeetToYards(feet));
		System.out.println("Meters to Inches " + convertMetersToInches(meter));
		System.out.println("Inches to Meters  " +convertInchesToMeters(inches));
		System.out.println("Inches to centimeters " + convertInchesToCentimeters(inches));
	}
}
