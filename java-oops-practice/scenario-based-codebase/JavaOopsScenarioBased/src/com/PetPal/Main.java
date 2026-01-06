package com.PetPal;

public class Main {

	public static void main(String args[]) {
		Pet p1 = new Dog("Bruno", "Dog" , 4, 90, 20);
		Pet p2 = new Cat("Meechan", "Cat" , 1, 60, 30);	
		Pet p3 = new Bird("Cupicko", "Bird" , 2, 40, 20);	
		
		
		p1.feed();
		p2.feed();
		p3.feed();
		System.out.println(p2.getMood());
		System.out.println(p3.getMood());
		p1.makeSound();
		p2.play();
		p3.sleep();
		
		p1.updateMood();
		System.out.println(p1.getMood());
		
	}
	
	
	
	
	
	
}
