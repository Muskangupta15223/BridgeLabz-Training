package com.constructors.levelone;

public class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Muskan", 20);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}

