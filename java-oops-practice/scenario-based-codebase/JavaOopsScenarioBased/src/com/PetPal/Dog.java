package com.PetPal;

public class Dog extends Pet {

	
	
	
	
	
	Dog(String name, String type, int age,int hungerLevel, int energyLevel ){
		super(name, type, age, hungerLevel, energyLevel);
	}
	void makeSound() {
		System.out.println("Dog is Barking......");
	}
	@Override
	public void feed() {
		System.out.println("Dog is feeding......");
	    hungerLevel -= 20;
	    energyLevel += 10;
	    updateMood();
	}
	@Override
	public void play() {
		System.out.println("Dog is playing");
	}
	@Override
	public void sleep() {
		System.out.println("Dog is Sleeping");
	}

}
