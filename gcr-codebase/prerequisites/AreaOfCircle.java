import java.util.*;
class AreaOfCircle{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double PI = 3.14;
      System.out.println("Give Radius");
      int radius = sc.nextInt();
      System.out.println("Area of Circle is: " + PI*radius*radius);
  }
}  
