package com.inheritance.AssistedProblems.AnimaHierarchy;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 12);
        dog.dogDetails();
        dog.makeSound();
        Bird bird = new Bird("Uruu", 2);
        bird.birdDetails();
        bird.makeSound();
        Cat cat = new Cat("Meechan", 15);
        cat.catDetails();
        cat.makeSound();
    }
}
