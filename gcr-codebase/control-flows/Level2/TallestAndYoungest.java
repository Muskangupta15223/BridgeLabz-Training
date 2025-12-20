import java.util.*;
// create class Tallest for finding tallest from 3 friends
public class TallestAndYoungest{
	public static void main(String args[]){ 
		//Taking age and height as input from user of 3 friends	
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int height1 = sc.nextInt();
		int age2 = sc.nextInt();
		int height2 = sc.nextInt();
		int age3 = sc.nextInt();
		int height3 = sc.nextInt();

		//calculation for finding youngest friend by using age of three friends
		if(age1 < age2 && age1 < age3){System.out.println("the youngest friend is : friend1 whose age is "+ age1);}
		else if(age2 < age1 && age2 < age3){System.out.println("the youngest friend is : friend2 whose age is "+ age2);}
		else {System.out.println("the youngest friend is : friend3 whose age is "+ age3);}


//calculation for finding tallest friend by using height of three friends
		if(height1 > height2 && height1 > height3){System.out.println("the tallest friend is : friend1 whose height is "+ height1);}
		else if(height2 > height1 && height2 > height3){System.out.println("the tallest friend is : friend2 whose height is "+ height2);}
		else {System.out.println("the tallest friend is : friend3 whose height is "+ height3);}

	}
}
