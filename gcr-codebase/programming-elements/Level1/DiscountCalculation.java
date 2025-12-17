//Creating Class with name DiscountCalculation for calculating discount and final fee
class DiscountCalculation{
    public static void main(String args[]){
         // Declaring variables to store fee and discount percentage
         int fee = 125000;
         int discountPercent = 10;

         // Calculating discount amount and total fee after discount
         double discount = (fee * discountPercent) / 100;
         double totalFee = fee - discount;

         // Displaying discount details
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + totalFee);
    }
}