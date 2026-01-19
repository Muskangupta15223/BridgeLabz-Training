package com.sortingalgorithm.bubblesort.fitnesstracker;

public class Main {

	public static void main(String args[]) {
		User u[] = {
				new User("Muskan", 9000),
				new User("Afroz", 20000),
				new User("Raghav" , 8000),
				new User("Piyush" , 5000)	
		};
		for(int i = 0; i < u.length; i++) {
			System.out.println(u[i].getUsername() + "| " + u[i].getSteps());
		}
		
		BubbleSort.bubblesortsteps(u);
		
		System.out.println("==================");
		for(int i = 0; i < u.length; i++) {
			System.out.println(u[i].getUsername() + "| " + u[i].getSteps() +" steps");
		}
	}
}
