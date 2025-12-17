import java.util.*;
//Creating Class with name DiscountOnStudentFee for calculating discount and discount fee using user input 
class DiscountOnStudentFee{
    public static void main(String args[]){
         // Taking fee and discount percent as input from user
         Scanner sc = new Scanner(System.in);
         int fee = sc.nextInt();
         int discountPercent = sc.nextInt();

         // Calculating discount amount and totalFee
         double discount = (fee * discountPercent) / 100;
         double totalFee = fee - discount;

         // Displaying discount details
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + totalFee);
    }
}