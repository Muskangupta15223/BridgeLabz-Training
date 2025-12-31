import java.util.Scanner;

public class LuckyDraw {

    public static void getResult(int ticket) {
        if (ticket % 15 == 0) {
            System.out.println(" Winner!!!! You got a gift hamper");
        } else {
            System.out.println(" Better luck next time");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Lucky Draw!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of participants:");
        int numOfPeople = sc.nextInt();
        int[] tickets = new int[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            if (tickets[i] < 0) {
                System.out.println("Invalid ticket number. Please enter a non-negative integer.");
                i--;
                continue;
            } else {
                System.out.println("Enter ticket value");
                tickets[i] = sc.nextInt();

                getResult(tickets[i]);
            }
        }

    }

}
