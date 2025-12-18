import java.util.*;
 //Creating class PerimeterOfSquare for calculating length of square 
public class PerimeterOfSquare{
  public static void main(String args[]){
  //Taking perimeter as input from user 
  Scanner sc = new Scanner(System.in);
  double perimeter = sc.nextInt();
   
  // calculate side of square
  double side = perimeter / 4;
  
  //display output
  System.out.println(" The length of the side is " + side + " whose perimeter is " + perimeter);
 
  }
}