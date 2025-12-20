import java.util.*;
// Create class StoreMultipleValue to find the total of that values.
public class  StoreMultipleValue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//declare array of num name
		double[] arr = new double[10];
		double total = 0.0;

		//Taking input from user 
		int idx = 0;
		while(true){
			arr[idx] = sc.nextDouble();
			if(arr[idx] <= 0 || idx > 10) {break;}			
			idx++;	
		}

		// find total sum of all values for finding mean
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		
		System.out.println("The total : " + total );

		//close the scanner
		sc.close();
	}
}