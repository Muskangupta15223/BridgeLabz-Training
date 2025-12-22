//titex@2025#12
import java.util.*;
public class NumberChecker1 {

	public static int countDigits(int number) {
        	int digitCount = 0;
        	int tempNumber = number;

        	while (tempNumber != 0) {
           	 digitCount++;
            	tempNumber /= 10;
        	}
       		return digitCount;
	}

	public static int[] extractDigits(int number) {
		int digitCount = countDigits(number);
        	int[] digitsArray = new int[digitCount];
        	int tempNumber = number;
		for (int index = digitCount - 1; index >= 0; index--) {
			digitsArray[index] = tempNumber % 10;
			tempNumber /= 10;
		}
		return digitsArray;
	}

	public static boolean isDuckNumber(int[] digitsArray) {
		for (int digit : digitsArray) {
			if (digit != 0) {
                return true;
		}
	}
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digitsArray) {
        int digitCount = digitsArray.length;
        int sum = 0;
        for (int digit : digitsArray) {
            sum += Math.pow(digit, digitCount);
        }
        return sum == number;
    }

    public static void findLargestAndSecondLargest(int[] digitsArray) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digitsArray) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find smallest and second smallest digits
    public static void findSmallestAndSecondSmallest(int[] digitsArray) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digitsArray) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } 
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
	
        System.out.println("Number: " + number);
        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);
        int[] digitsArray = extractDigits(number);
        System.out.print("Digits: ");
        for (int digit: digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digitsArray));
        findLargestAndSecondLargest(digitsArray);
        findSmallestAndSecondSmallest(digitsArray);
    }
}