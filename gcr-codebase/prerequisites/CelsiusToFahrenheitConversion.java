import java.util.*;
class  CelsiusToFahrenheitConversion{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int celVal = sc.nextInt();
   int fahVal;
   fahVal = celVal * (9/5)+32;
   System.out.println(fahVal); 
   }
}
