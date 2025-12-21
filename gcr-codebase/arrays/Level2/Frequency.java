import java.util.*;
public class Frequency {
    public static void main(String[] args) {
	//taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        //count num of digits in the number
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        int[] frequency = new int[10];
        for (int digit: digits) {
            frequency[digit]++;
        }
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(frequency));

        sc.close();
    }
}