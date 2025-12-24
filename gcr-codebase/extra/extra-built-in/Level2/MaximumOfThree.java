import java.util.Scanner;

public class MaximumOfThree {

    // Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // Method to take user input
    public static int takeInput(Scanner sc) {
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = takeInput(sc);

        System.out.print("Enter second number: ");
        int num2 = takeInput(sc);

        System.out.print("Enter third number: ");
        int num3 = takeInput(sc);

        int maximum = findMaximum(num1, num2, num3);

        System.out.println("Maximum number is: " + maximum);

        sc.close();
    }
}