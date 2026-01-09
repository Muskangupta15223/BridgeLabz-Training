package com.Artify;
import java.util.*;
public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// user objects
		User user1 = new User("Muskan", 2500);
		User user2 = new User("Krishna", 3500);
		
		
		System.out.println("Enter title of Art : ");
		String title = sc.nextLine();
		System.out.println("Enter artist name : ");
		String name = sc.nextLine();
		System.out.println("Enter price : ");
		double price = sc.nextDouble();
		sc.nextLine();
		boolean preview = true;
		String licensetype = "Editorial-Use";
		
		// artwork objects
		Artwork digiArt = new DigitalArt(title, name, price, licensetype, preview);
		System.out.println(user1.getWalletBalance());
		digiArt.displayInfo();
		digiArt.purchase(user1);
		System.out.println(user1.getWalletBalance());
		System.out.println("---------------");
		
		System.out.println("Enter title of Art : ");
		 title = sc.nextLine();
		System.out.println("Enter artist name : ");
		 name = sc.nextLine();
		System.out.println("Enter price : ");
		 price = sc.nextDouble();
		 licensetype = "Royalty-Free";
		
		// artwork object
		Artwork printArt = new PrintArt(title, name, price, licensetype, preview);
		System.out.println(user2.getWalletBalance());
		printArt.displayInfo();
		printArt.purchase(user2);
		System.out.println(user2.getWalletBalance());
		System.out.println("------------");
		
		
	
	
	}
}
