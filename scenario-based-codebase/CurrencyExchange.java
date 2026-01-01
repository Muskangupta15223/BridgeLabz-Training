import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continueConversion = "";
        do {
            System.out.println("Enter amount in INR:");
            double inrAmount = sc.nextDouble();
            System.out.println("Enter target currency (USD, EUR, GBP, JPY):");
            String targetCurrency = sc.next().toUpperCase();
            double convertedAmount = 0.0;

            switch (targetCurrency) {
                case "USD":
                    convertedAmount = inrAmount * 0.013;
                    break;
                case "EUR":
                    convertedAmount = inrAmount * 0.011;
                    break;
                case "GBP":
                    convertedAmount = inrAmount * 0.0095;
                    break;
                case "JPY":
                    convertedAmount = inrAmount * 1.5;
                    break;
                default:
                    System.out.println("Unsupported currency.");
                    continue;
            }

            System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
            System.out.println("Do you want to perform another conversion? (yes/no):");
            continueConversion = sc.next();
        } while (continueConversion.equalsIgnoreCase("yes"));

        sc.close();
    }

}
