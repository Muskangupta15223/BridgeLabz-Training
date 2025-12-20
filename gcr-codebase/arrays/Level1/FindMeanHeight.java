

import java.util.*;
// Create class FindMeanHeight to find the mean.
public class  FindMeanHeight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//declare array of num name
		double[] arr = new double[11];
		double sum = 0;

		//Taking input from user 
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextDouble();
		}

		// find total sum of all values for finding mean
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		System.out.println("the mean height of the football team :" + sum /arr.length);

		//close the scanner
		sc.close();
	}
}