import java.util.*;
class  CelsiusToFahrenheitConversion{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int cel_val = sc.nextInt();
   int fah_val;
   fah_val = cel_val * (9/5)+32;
   System.out.println(fah_val); 
   }
}
