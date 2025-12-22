public class NumberChecker{

    // Method to count digits in a number
    public static int countDigits(int number) {
        int digitCount = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
        return digitCount;
    }

    // Method to extract digits and store them in an array
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

    // Method to find sum of digits using digits array
    public static int calculateSumOfDigits(int[] digitsArray) {
        int sum = 0;

        for (int digit : digitsArray) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int calculateSumOfSquares(int[] digitsArray) {
        int sumOfSquares = 0;

        for (int digit : digitsArray) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digitsArray) {
        int sumOfDigits = calculateSumOfDigits(digitsArray);
        return number % sumOfDigits == 0;
    }

    // Method to find digit frequency using 2D array
    public static int[][] calculateDigitFrequency(int[] digitsArray) {
        int[][] frequencyArray = new int[10][2];

        // Initialize digits
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
            frequencyArray[i][1] = 0;
        }

        // Count frequency
        for (int digit : digitsArray) {
            frequencyArray[digit][1]++;
        }

        return frequencyArray;
    }

    // Main method to test all utility methods
    public static void main(String[] args) {

        int number = 21;

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digitsArray = extractDigits(number);

        System.out.print("Digits: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = calculateSumOfDigits(digitsArray);
        System.out.println("Sum of Digits: " + sumOfDigits);

        int sumOfSquares = calculateSumOfSquares(digitsArray);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digitsArray));

        int[][] frequencyArray = calculateDigitFrequency(digitsArray);
        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i][1] > 0) {
                System.out.println(frequencyArray[i][0] + "\t" + frequencyArray[i][1]);
            }
        }
    }
}