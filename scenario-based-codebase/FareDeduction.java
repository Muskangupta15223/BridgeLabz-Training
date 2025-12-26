import java.util.Scanner;
public class FareDeduction{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100.0;
        while (balance > 0) {
            System.out.println("\nCurrent Balance: Rs " + balance);
            System.out.print("Enter distance (0 to quit): ");
            int distance = sc.nextInt();

            if (distance == 0) {
                break;
            }
            int fare = (distance >= 5) ? distance * 10 : distance * 20;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: Rs " + fare);
            } 
            else {
                System.out.println("Insufficient balance!");
                break;
            }
        }
        System.out.println("\nTrip ended. Remaining Balance: Rs " + balance);
        sc.close();
    }
}