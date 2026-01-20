package com.bagnballorganiser;
import java.util.ArrayList;

class Organiser {

    private ArrayList<Bag> bags = new ArrayList<>();

    public void addBag(Bag bag) {
        bags.add(bag);
    }

    // Display all bags and ball count
    public void displayAllBags() {
        System.out.println("\nAll Bags Status:");
        for (Bag b : bags) {
            System.out.println("Bag ID: " + b.getId() +
                               ", Color: " + b.getColor() +
                               ", Balls: " + b.getBallCount());
        }
    }
}
