import java.util.*;

public class Reservation {
    // Reservation class implementation
    public static void menu() {
        System.out.println("1. Make a Reservation");
        System.out.println("2. Cancel a Reservation");
        System.out.println("3. Vacancy Check");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 100;
        int count = 0;
        System.out.println("Welcome to the Reservation System");
        while (true) {
            menu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Making a Reservation...");
                    System.out.println("Enter number of seats to book: ");
                    int booking = sc.nextInt();

                    if (booking <= (totalSeats - count)) {
                        count += booking;
                        System.out.println("Successfully booked " + booking + " seats.\n\n");
                    } else {
                        System.out.println("Not enough seats available.\n\n");
                    }
                    break;
                case 2:
                    System.out.println("Cancelling a Reservation...");
                    System.out.println("Enter number of seats to cancel: ");
                    int cancel = sc.nextInt();

                    if (cancel <= count) {
                        count -= cancel;
                        System.out.println("Successfully cancelled " + cancel + " seats.\n\n");
                    } else {
                        System.out.println("You cannot cancel more seats than booked.\n\n");
                    }
                    break;
                case 3:
                    System.out.println("Vacancy Check...");
                    System.out.println("Available seats: " + (totalSeats - count) + "seats. \n\n");
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
