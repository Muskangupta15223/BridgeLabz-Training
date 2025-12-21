import java.util.Scanner;
// Create class LargestAndSecondLargest to find largest and second largest element from the array
public class LargestAndSecondLargest{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxDigit = 10;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int[] arr = new int[maxDigit];
		

		//Use loop to take user input 
		for(int idx = 0; idx < num; idx++){
			arr[idx] = sc.nextInt();
			if(arr[idx] > 0 && idx < maxDigit){ 
				arr[idx] = arr[idx]/10;
			}else{
				break;
			}
		}
		
		//use loop to find largest and second largest in the array
		for(int i = 0; i < num; i++){
			if(largest < arr[i]){
				secondLargest = largest;
				largest = arr[i];
			}else if(secondLargest <= arr[i] && arr[i] != largest){
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest num is: " + largest + " and Second largest is : " + secondLargest);
	}
}