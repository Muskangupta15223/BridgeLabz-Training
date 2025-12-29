import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guessNum;
        int count = 1;
        System.out.println("Guess number between 1 to 100 only:");
        do {
            System.out.println("Enter your guess:");
            guessNum = sc.nextInt();
            count++;
            if (guessNum < randomNumber) {
                System.out.println("Too low! Try again:");

            } else if (guessNum > randomNumber) {
                System.out.println("Too High !Try again: ");
            } else {
                System.out.println("Congratulations!!!!!!! You've guessed the number successfully");
                break;
            }

        } while (count <= 5 && guessNum != randomNumber);
        if (count > 5) {
            System.out.println("Sorry! You've used all attempts. The number was: " + randomNumber);
        }
        sc.close();
    }
}