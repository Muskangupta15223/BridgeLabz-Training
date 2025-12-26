import java.util.*;

public class CoffeeCounter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0.0;

        while (true) {
            System.out.println("(espresso, latte, cappuccino) or 'exit' :");
            String coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            System.out.println("quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double pricePerCup;

            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 3.00;
                    break;
                case "latte":
                    pricePerCup = 4.00;
                    break;
                case "cappuccino":
                    pricePerCup = 4.50;
                    break;
                default:
                    System.out.println("Invalid");
                    continue;
            }

            double bill = pricePerCup * quantity;
            double gst = bill * 0.07;
            double totalForThisOrder = bill + gst;

            totalBill += totalForThisOrder;

            System.out.printf("Order: %s | Qty: %d | Bill: $%.2f | GST: $%.2f | Total: $%.2f%n",coffeeType, quantity, bill, gst, totalForThisOrder
            );
        }

        System.out.printf("%nFinal Total Bill: $%.2f%n", totalBill);
        sc.close();
    }
}