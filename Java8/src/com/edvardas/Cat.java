package com.edvardas;

public class Cat extends Animal {
    private int age;

    public Cat() {
        super("Meow!");
    }

    public Cat(int age) {
        this.age = age;
    }

    public static String sound() {
        return "Meow!";
    }
}
