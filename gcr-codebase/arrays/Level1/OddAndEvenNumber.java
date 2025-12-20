import java.util.*;
public class OddAndEvenNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// check number is positive or not
		if(number > 0 ){
			// declare two array oddArray and evenArray for storing values
			int[] oddArray = new int[number / 2 + 1];
			int[] evenArray = new int[number / 2 + 1];
			int oIdx = 0;
			int eIdx = 0;

			//using loop to traverse on array and find value is even or odd
			for(int i = 1; i <= number ; i++){
				if(i % 2 == 0){ 
					evenArray[eIdx++] = i;
				}else{ 
					oddArray[oIdx++] = i;
				}
			}

			// printing even and odd array
			System.out.println("Even array : ");
			for(int i = 0; i < eIdx ; i++){
				System.out.print(evenArray[i] + " ");
			}
			System.out.println("Odd array : ");
			for(int i = 0; i < oIdx ; i++){
				System.out.print(oddArray[i] + " ");
			}

		}else{
			System.out.println("  error ");
		}
	}
}