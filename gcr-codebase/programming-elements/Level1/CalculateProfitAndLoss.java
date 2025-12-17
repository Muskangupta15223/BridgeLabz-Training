//Creating Class with name CalculateProfitAndLoss for calculating profit and profit percentage
class CalculateProfitAndLoss{
    public static void main(String args[]){
       // Creating variables costPrice and sellingPrice
       double costPrice = 129;
       double sellingPrice = 191;

       // Calculating profit and profit percentage
       double profit = sellingPrice - costPrice;
       double profitPercentage = (profit / costPrice) * 100;

       // Displaying profit details
       System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
   }
}