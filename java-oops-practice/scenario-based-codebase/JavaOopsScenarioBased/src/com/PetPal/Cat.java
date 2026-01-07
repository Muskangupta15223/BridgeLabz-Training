package com.PetPal;

public class Cat extends Pet {

	Cat(String name, String type, int age,int hungerLevel, int energyLevel ){
		super(name, type, age, hungerLevel, energyLevel);
	}

	void makeSound(){
		System.out.println("Cat say meow......");
	}
	
	@Override
	public void feed() {
		System.out.println("Cat is feeding......");
	    hungerLevel -= 20;
	    energyLevel += 10;
	    updateMood();
	}
	@Override
	public void play() {
		System.out.println("Cat is playing");
	}
	@Override
	public void sleep() {
		System.out.println("Cat is Sleeping");
	}
	
}
