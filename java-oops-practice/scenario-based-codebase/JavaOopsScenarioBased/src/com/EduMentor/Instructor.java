package com.EduMentor;

public abstract class Instructor extends User {

	Instructor(String name, String email, int userId) {
		super(name, email, userId);
	}

	public void displayInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Email : " + getEmail());
		System.out.println("UserId : " + getUserId());
	}

}
