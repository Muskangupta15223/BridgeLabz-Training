import java.util.*;
//Creating Class with name CentimetersToFeetAndInches for converting height from cm to feet and inches.
class CentimeterToFeetAndInches{
    public static void main(String args[]){
       // Taking height in centimeters as input from user
       Scanner sc=new Scanner(System.in);
       double heightCm = sc.nextDouble();

       // Converting centimeters to inches and feet
       double cmToInches = heightCm / 2.54;
       double cmToFeet = cmToInches / 12;

       // Displaying converted height
       System.out.println("Your Height in cm is " + heightCm + " while in feet is " + cmToFeet + " and inches is " + cmToInches);
    }
}