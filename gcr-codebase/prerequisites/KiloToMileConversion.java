import java.util.*;
class KiloToMileConversion{

   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
   System.out.println("give kilometer value");
    double kilometers = sc.nextInt();
    double miles = kilometers * 0.621371; 
    System.out.println(miles);
   }
}