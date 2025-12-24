import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate computer guess
    public static int generateGuess(int low, int high) {
        return (low + high) / 2; // binary search approach
    }

    // Method to get user feedback
    public static String getUserFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean isCorrect = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isCorrect) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getUserFeedback(sc);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number correctly!");
                isCorrect = true;
            } else {
                System.out.println("Invalid feedback. Please enter high, low, or correct.");
            }
        }

        sc.close();
    }
}