package com.bagnballorganiser;

import java.util.ArrayList;

class Bag implements IStorable {

    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    // Add ball (capacity check)
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println(" Bag " + id + " is full. Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println(" Ball added to Bag " + id);
    }

    // Remove ball by ID
    public void removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equalsIgnoreCase(ballId)) {
                balls.remove(b);
                System.out.println(" Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println(" Ball not found in Bag " + id);
    }

    // Display balls in bag
    public void displayBalls() {
        System.out.println(" Bag " + id + " contains:");
        if (balls.isEmpty()) {
            System.out.println("No balls.");
        }
        for (Ball b : balls) {
            System.out.println(b);
        }
    }

    // Ball count
    public int getBallCount() {
        return balls.size();
    }
}
