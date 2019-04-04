package com.edvardas;

public class Animal {
    private String sound;
    private int age;

    public Animal() {
        this.sound = "";
        this.age = 0;
    }

    public Animal(String sound) {
        this.sound = sound;
        this.age = 0;
    }

    @Override
    public String toString() {
        return sound;
    }
}
