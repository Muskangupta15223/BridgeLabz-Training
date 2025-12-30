import java.util.*;

public class MovieTicketBooking {

    public static int seatType() {
        int seatCharge;
        System.out.println("Available Seat Types: \n 1. Gold \n 2. Silver \n 3. Platinum");
        Scanner sc = new Scanner(System.in);
        int seatChoice = sc.nextInt();
        switch (seatChoice) {
            case 1:
                seatCharge = 100;
                break;
            case 2:
                seatCharge = 50;
                break;
            case 3:
                seatCharge = 150;
                break;
            default:
                System.out.println("Invalid choice");
                seatCharge = 0;
                break;
        }
        return seatCharge;
    }

    public static int snacks() {
        System.out.println("Want snacks? \n 1. Yes \n 2. No");
        Scanner sc = new Scanner(System.in);
        int snackChoice = sc.nextInt();
        if (snackChoice == 1) {
            return 150;
        } else {
            return 0;
        }
    }

    public static double totalbill(int basePrice, int seatCHarge, int snacks) {
        double total = basePrice + seatCHarge + snacks;
        double tax = total * 0.18;
        return total + tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Movie Ticket Booking System");
        System.out.print("Enter number of tickets to book: ");
        int people = sc.nextInt();
        System.out.println("Select Movie Type: \n 1. Bollywood \n 2. Hollywood \n 3. Trollywood");
        int choice = sc.nextInt();
        int price = 0;
        switch (choice) {
            case 1:
                price = people * 250;
                break;
            case 2:
                price = people * 300;
                break;
            case 3:
                price = people * 200;
                break;
            default:
                System.out.println("Invalid choice");
        }

        int seatCharge = seatType();
        int snackCharge = snacks();
        double totalBill = totalbill(price, seatCharge, snackCharge);
        System.out.println("Total bill amount: Rs " + totalBill);

    }

}