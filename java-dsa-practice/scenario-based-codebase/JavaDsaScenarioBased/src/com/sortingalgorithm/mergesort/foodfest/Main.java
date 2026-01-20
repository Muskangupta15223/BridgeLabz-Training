package com.sortingalgorithm.mergesort.foodfest;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Stall> masterList = new ArrayList<>();

        masterList.add(new Stall("Burger Zone", 120));
        masterList.add(new Stall("Pizza Hub", 180));
        masterList.add(new Stall("Taco Town", 320));
        masterList.add(new Stall("Pasta Palace", 150));
        masterList.add(new Stall("Noodle Nest", 200));

        FoodFest fest = new FoodFest();
        fest.mergeSort(masterList, 0, masterList.size() - 1);

        System.out.println("🍽 FoodFest Stall Performance (Sorted by Footfall):");
        for (Stall s : masterList) {
            System.out.println(s);
        }
    }
}

