package com.functionalinterface.cloningprototype;

public class PrototypeApp {

    public static void main(String[] args) {

        // Predefined prototype object
        VehiclePrototype original =
                new VehiclePrototype(101, "Tesla Model 3");

        // Cloning the prototype
        VehiclePrototype cloned =
                (VehiclePrototype) original.clone();

        System.out.println("Original Object:");
        original.display();

        System.out.println("Cloned Object:");
        cloned.display();
    }
}