package com.edvardas;

public class Dog extends Animal {

    private int age;

    public Dog() {
        super("Woof!");
    }

    public Dog(int age) {
        this.age = age;
    }

    public static String sound() {
        return "Woof!";
    }
}
