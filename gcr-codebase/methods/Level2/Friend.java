import java.util.*;
public class Friend{

	// create a method to find youngest friend age
	public void findYoungest(int[] age){
		System.out.println("Youngest friend age " + Math.min(Math.min(age[0], age[1]),age[2]));		
	}

	// create a method to find tallest height among friend
	public void findTallest(int[] height){
			System.out.println("Tallest friend height " + Math.max(Math.max(height[0],height[1]),height[2]));		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age[] = new int[3];
		int height[] = new int[3];
		
		// take age and height as input
		for(int i = 0; i < 3; i++){
			System.out.println("Give me age and height of friend");
			age[i] = sc.nextInt();
			height[i] = sc.nextInt();
		}

		// create object and call methods
		Friend f = new Friend();
		f.findYoungest(age);
		f.findTallest(height);

	}
}