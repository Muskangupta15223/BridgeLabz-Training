import java.util.*;
public class FactorStoreInArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int maxFactor = 10;
		int index = 0;
		int[] factArr = new int[maxFactor];
		 for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
			// if array is full then increase size

                		if (index == maxFactor) {
					maxFactor = maxFactor * 2;
					int[] temp = new int[maxFactor];

					// copy old elements to new array
					for (int j = 0; j < index; j++) {
					 	temp[j] = factArr[j];
					}

					// assign new array
					factArr = temp; 
				}
                	factArr[index] = i;
                	index++;
            		}
		}

		System.out.println("Factors are:");
		for (int i = 0; i < index; i++) {
			System.out.print(factArr[i] + " ");
		}

		sc.close();
	}
}