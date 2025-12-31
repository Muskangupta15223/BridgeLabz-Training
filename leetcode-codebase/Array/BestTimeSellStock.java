import java.util.Scanner;

public class BestTimeSellStock {
    // Method to calculate maximum profit
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[7];
        System.out.println("Enter stock prices for 7 days:");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
