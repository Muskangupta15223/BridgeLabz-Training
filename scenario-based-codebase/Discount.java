import java.util.*;
public class Discount{
	
	//create method to findDiscount
	public static double[] isDiscount(double[] price){
			double newPrice[] = new double[price.length];
		for(int i = 0; i < price.length; i++){
			if(price[i] >= 300){
				newPrice[i] = (price[i] * 15)/100;
			}else if(price[i] > 50 && price[i] < 300){
				newPrice[i] = (price[i] * 5)/100;
			}
			newPrice[i] = price[i] - newPrice[i];
		}
		return newPrice;
	}
	
	// create method to display result in format
	public static void display(String[] item, double[] price, double[] newPrice){
		int n = item.length;
		double[][] res = new double[n][2];
		for(int i = 0; i < n; i++){
			res[i][0] =  price[i];
			res[i][1] =  newPrice[i];
		
		System.out.printf("%-15s %-15s %-15s%n", item[i], res[i][0], res[i][1]);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] item = {"Detergent", "Soap", "Lotion", "Bottle", "Cream"};
		double [] price = new double[item.length];
		System.out.println("Give the prices of item");

		// Loop for item price
		for(int i = 0; i < price.length; i++){
			System.out.println("give price of " + item[i] + " :");
			price[i] = sc.nextInt();
		}

		// call methods and display result		
		double[] newPrice = isDiscount(price);
		display(item,price,newPrice);
		
		
	}
}