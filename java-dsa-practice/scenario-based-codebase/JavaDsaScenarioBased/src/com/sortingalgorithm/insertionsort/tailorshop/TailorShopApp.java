package com.sortingalgorithm.insertionsort.tailorshop;

import java.util.ArrayList;

public class TailorShopApp {

	public static void main(String args[]) {
		
		ArrayList<Clothes> cloth = new ArrayList<>();
		
				cloth.add(new Clothes("Kurti" , "10:00"));
				cloth.add(new Clothes("Blazer" , "21:00"));
				cloth.add(new Clothes("Pant" , "07:00"));
				cloth.add(new Clothes("Coat" , "09:00"));
				
		InsertionSort.insertionSort(cloth);
		for(Clothes c : cloth) {
		System.out.println(  c.name+ " |" + c.deliverytime);
		}
	}
}
