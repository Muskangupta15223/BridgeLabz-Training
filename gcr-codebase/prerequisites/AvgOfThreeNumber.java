import java.util.*;
class AvgOfThreeNum{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int num1 = sc.nextInt();
     int num2 = sc.nextInt();
     int num3 = sc.nextInt();
     double avg = (num1 + num2 + num3)/100;
     System.out.println("Average Of Three Numbers: " + avg);
  }
}
