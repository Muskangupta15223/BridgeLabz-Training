import java.util.*;
class Power{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int power = sc.nextInt(); 
    double answer = Math.pow(base , power); 
   System.out.println(answer);
  }
}