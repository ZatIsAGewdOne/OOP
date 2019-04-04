package com.edvardas;

public class Farm {

    private Animal[] arr;
    private String name;

    public Farm(String name, Animal[] arr) {
        this.name = name;
        this.arr = arr;
    }

    @Override
    public String toString() {
        int dogCount = 0;
        int catCount = 0;
        int sheepCount = 0;
        int cowCount = 0;
        int chickenCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Cat) {
                catCount++;
            } else if(arr[i] instanceof Dog) {
                dogCount++;
            } else if(arr[i] instanceof Sheep) {
                sheepCount++;
            } else if(arr[i] instanceof Cow) {
                cowCount++;
            } else if(arr[i] instanceof Chicken) {
                chickenCount++;
            }
        }

        return "\nThere are " + catCount + " cats, " + Cat.sound() + " " + dogCount + " dogs, " + Dog.sound() + " " + sheepCount + " sheep, "+ Sheep.sound() + " " + cowCount + " cows, "+ Cow.sound() + " " + chickenCount + " chickens, " + Chicken.sound();
    }

    public void setArr(Animal[] arr) {
        this.arr = arr;
    }

    public Animal[] getArr() {
        return arr;
    }

    public String getName() {
        return name;
    }
}
