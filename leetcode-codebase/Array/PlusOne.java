import java.util.*;
public class PlusOne {
    public static int[] addPlusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
        	if(digits[i] < 9){
            	digits[i]++;
           	 return digits;
        	}
        digits[i] = 0;
    	}
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter arrays element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(addPlusOne(arr)));
	}
}