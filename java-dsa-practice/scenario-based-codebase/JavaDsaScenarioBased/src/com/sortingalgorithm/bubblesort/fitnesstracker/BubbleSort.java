package com.sortingalgorithm.bubblesort.fitnesstracker;

public class BubbleSort {

	public static void bubblesortsteps(User[] user) {
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < user.length - 1- i; j++) {
				if(user[j].getSteps() > user[j+1].getSteps()) {
					User temp = user[j+1];
					user[j+1] = user[j];
					user[j] = temp;
				}
			}
		}
	}
}
