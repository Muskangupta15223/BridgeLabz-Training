import java.util.*;
  // creating class AreaOfTriangle for calculating Area in cm and inches 

public class AreaOfTriangle{
  public static void main(String args[]){ 
  // Taking height and base as input from user
  Scanner sc = new Scanner(System.in);
  int height = sc.nextInt();
  int base = sc.nextInt();
  
  // calculate area
  double cmArea = (base*height)/2;
  double inchesArea = cmArea / 2.54;

  // display area of triangle in inches and cm
  System.out.println("The Area of the triangle in sq inches is "+ inchesArea +" and sq cm is "+ cmArea);
	
  }
}