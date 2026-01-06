package com.FitTrack;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private String goal;
	private int dailyCalorieTarget;
	
	UserProfile(String name, int age, double weight){
		this.setName(name);
		this.setAge(age);
		this.setWeight(weight);
		this.goal = "Stay Fit";
		 calculateDailyTarget();
	}
	
	UserProfile(String name, int age, double weight, String goal){
		this.setName(name);
		this.setAge(age);
		this.setWeight(weight);
		this.goal = goal;
		 calculateDailyTarget();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCalorieTarget() {
		return dailyCalorieTarget;
	}
	public String getGoal() {
		return goal;
	}
	 public int calculateDailyTarget() {
	        dailyCalorieTarget = (int) (weight * 30);
	        return dailyCalorieTarget;
	    }

    public int calculateProgress(int caloriesBurned) {
	        return dailyCalorieTarget - caloriesBurned;
    }

    public void displayProfile() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Goal: " + goal);
	        System.out.println("Daily Target: " + dailyCalorieTarget);
     }
}
