package com.PetPal;

public class Bird  extends Pet{

	Bird(String name, String type, int age,int hungerLevel, int energyLevel ){
		super(name, type, age, hungerLevel, energyLevel);
	}
	void makeSound() {
		System.out.println("Bird is Chirping......");
	}
	@Override
	public void feed() {
		System.out.println("Bird is feeding......");
	    hungerLevel -= 20;
	    energyLevel += 10;
	    updateMood();
	}
	@Override
	public void play() {
		System.out.println("Bird is playing");
	}
	@Override
	public void sleep() {
		System.out.println("Bird is Sleeping");
	}
}
