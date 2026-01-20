package com.bagnballorganiser;
public class Main {
    public static void main(String[] args) {

        Bag bag1 = new Bag("B1", "Red", 2);
        Bag bag2 = new Bag("B2", "Blue", 3);

        Ball ball1 = new Ball("BALL1", "Yellow", "Small");
        Ball ball2 = new Ball("BALL2", "Green", "Medium");
        Ball ball3 = new Ball("BALL3", "Red", "Large");

        bag1.addBall(ball1);
        bag1.addBall(ball2);
        bag1.addBall(ball3); // ❌ exceeds capacity

        bag1.displayBalls();

        bag1.removeBall("BALL2");
        bag1.displayBalls();

        Organiser organizer = new Organiser();
        organizer.addBag(bag1);
        organizer.addBag(bag2);

        organizer.displayAllBags();
    }
}

