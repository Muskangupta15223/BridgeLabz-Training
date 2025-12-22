import java.util.*;
public class NumberChecker2{

	public static int[] digitCount(int num ){
		int rem = 0, count = 0;
		int temp = num;
		while(temp > 0){
			rem = temp % 10;
			temp = temp / 10;
			count++;
		}
		int[] res = new int[count];
		for(int i = 0; i < count; i++){
			res[i] = num % 10;
			num = num / 10;
		}
		return res;
	}
	public static int[] reverseArray(int [] arr){
		int[] arr2 = new int[arr.length];
		for(int i = arr.length-1; i >= 0; i--){
			arr2[i] = i;	
		}
 		return arr2;
	}

	public static boolean compareArray(int[] arr1 , int[] arr2){
		if( arr1.length != arr2.length) return false;
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i]) return false;
		}
		return true;
	}

	public static boolean isPallindrome(int num){
		int rem = 0, sum = 0 , temp = num;
		while(num > 0){
		rem = num % 10;
		sum = sum * 10 + rem;
		num = num/10;
		}
		if( sum == temp){
			return true;
		}
		return false;
	}
	
	public static boolean[] isDuckNumber(int[] arr){
		boolean res[] = new boolean[arr.length];
		for(int i =0; i< arr.length; i++){
			if(arr[i] == 0){
				res[i] = false;
			}
			else{
				res[i] = true;
			}
		}
		return res;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me number : ");
		int num = sc.nextInt();
		int[] arr = digitCount(num);
		System.out.println("Store the array" + Arrays.toString(arr));
		System.out.println("Reverse the array" +Arrays.toString(reverseArray(arr)));
		System.out.println("Give me size of 2 arrays: ");

		int size = sc.nextInt();
		int size2 = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size2];
		for(int i = 0; i < size; i++){
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < size2; i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("is Both Arrays are equal : " + compareArray(arr1, arr2));
		System.out.println("Give me number : ");
		int number = sc.nextInt();
		System.out.println("it is Pallindrome: " + isPallindrome(number));
		System.out.println("it is duck number: " + Arrays.toString(isDuckNumber(arr1)));
	}
}