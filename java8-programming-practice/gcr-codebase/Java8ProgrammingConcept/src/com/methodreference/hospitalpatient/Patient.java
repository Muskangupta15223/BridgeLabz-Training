package com.methodreference.hospitalpatient;

public class Patient extends Object{

	private int id;
	private String name;
	
	Patient(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Id : "+ id + ", name : " + name;
	}
}
