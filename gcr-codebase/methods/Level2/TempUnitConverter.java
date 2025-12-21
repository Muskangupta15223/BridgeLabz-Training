import java.util.*;
public class TempUnitConverter{

	// create methods for unit conversions for temperature, weights and volumes
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheittoCelsius = (farhenheit - 32) * 5 / 9;
		return farhenheittoCelsius;
	}

	public static double convertCelsiusToFarhenheit(double celsius) {
		 double celsiustoFarhenheit = (celsius * 9 / 5) + 32;
		return  celsiustoFarhenheit;
	}
  
	public static double convertPoundsToKilograms(double pounds) {
		return pounds * 0.453592;
	}

	public static double convertKilogramsToPounds(double kilograms) {
		return kilograms * 2.20462;
	}

	public static double convertGallonsToLiters(double gallons) {
		return gallons *3.78541;
	}
	public static double convertLitersToGallons(double liters) {
		return liters * 0.264172;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();	
		double celsius = sc.nextDouble();		
		double pounds = sc.nextDouble();		
		double kilograms = sc.nextDouble();	
		double gallons = sc.nextDouble();
		double liters = sc.nextDouble();


		// display output
		System.out.println(" Conversion : ");
		System.out.println("fahrenheit to celsius " + convertFarhenheitToCelsius(fahrenheit));
		System.out.println("celsius to fahrenheit " + convertCelsiusToFarhenheit(celsius));
		System.out.println("pounds to kilograms " + convertPoundsToKilograms(pounds));
		System.out.println("kilograms to pounds " + convertKilogramsToPounds(kilograms));
		System.out.println("gallons to liters " + convertGallonsToLiters(gallons));
		System.out.println("liters to gallons " + convertLitersToGallons(liters));
	}
}
