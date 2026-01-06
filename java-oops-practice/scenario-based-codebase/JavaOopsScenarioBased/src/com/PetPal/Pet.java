package com.PetPal;

public abstract class Pet implements IInteractable{
	
	private String name;
	String type;
	private int age;
	protected int hungerLevel;
	protected int energyLevel;
	private String mood;
	
	Pet(String name, String type, int age, int hungerLevel, int energyLevel ){
		this.name = name;
		this.type = type;
		this.age = age;
		this.hungerLevel = hungerLevel;
		this.energyLevel = energyLevel;
	}	
	
	abstract void makeSound();
	@Override
	abstract public void feed();
	abstract public void play();
	abstract public void sleep();
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMood() {
		return mood;
	}
	public void updateMood() {
	    if (hungerLevel > 50) {
	        mood = "Hungry";
	    } else if (energyLevel < 30) {
	        mood = "Tired";
	    } else {
	        mood = "Happy";
	    }
	}
}
