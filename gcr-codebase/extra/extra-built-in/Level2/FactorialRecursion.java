import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factorial is: " + factorial(number));

        sc.close();
    }
}