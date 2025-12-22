import java.util.*;
public class FindWindChill{
	//create method calculateWindChill to calculate wind chill using temperature and windspeed
	public double calculateWindChill(double t, double ws){
		ws = Math.pow(ws, 0.16);
		double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * ws ; 	
		return windChill;
	}

	public static void main(String args[]){
		// taking temperature and windSpeed as input from user
		Scanner sc = new Scanner(System.in);
		double temperature = sc.nextDouble();
		double windSpeed = sc.nextDouble();
		FindWindChill wc = new FindWindChill();
		System.out.println(wc.calculateWindChill(temperature,windSpeed));
	}
}