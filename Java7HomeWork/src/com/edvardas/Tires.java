package com.edvardas;

public class Tires {
    private String name;
    private double price;

    public Tires(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Tires() {
        this.name = "";
        this.price = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice();
    }

}
