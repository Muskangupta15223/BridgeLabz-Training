package com.lambdaexpression.schoolstudentsystem;

public class Student {

	private String name;
	int age;
	private int mark;
	private int rank;
	
	Student(String name, int age, int mark, int rank){
		this.name = name;
		this.age = age;
		this.mark = mark;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	

	public int getMark() {
		return mark;
	}

	public int getRank() {
		return rank;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString(){
		return "Name : " + name + " Age : " + age  + " Mark : "+ mark + " Rank : " + rank ;
		
	}
}
