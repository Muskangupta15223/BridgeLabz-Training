import java.util.Scanner;
// Create class TallestAndYoungest to find tallest and youngest guy amond friends group
public class TallestAndYoungest {
    public static void main(String[] args) {
		// Take numOfFriends as input and declare two array to store age and height of friends
		Scanner sc = new Scanner(System.in);
		int numOfFriends = 3;
		int[] age = new int[numOfFriends];
		int[] height = new int[numOfFriends];

		Take input of friends and store in age and height array
		for(int i = 0; i < numOfFriends; i++){
			System.out.println("Give me age as input");
			age[i] = sc.nextInt();
			System.out.println("Give me height as input");
			height[i] = sc.nextInt();	
		}

		// find which friend is youngest and tallest
		int young = age[0];
		int youngest = 1; 
		int tall = height[0];
		int tallest = 1; 
		for(int i = 1; i < numOfFriends; i++){
			if(young > age[i]){
				young = age[i];
				youngest = i+1;
			}

			if(tall < height[i]){
				tall = height[i];
				tallest = i+1;
			}				
		}
		System.out.println("The youngest friend is friend:" + youngest + " whose age is " + young);
		System.out.println("The tallest friend is friend:" + tallest +  " whose height is " + tall);		
	}
}