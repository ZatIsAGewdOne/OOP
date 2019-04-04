package com.edvardas;

public class Human {

    private String name;
    private String lastName;
    private int age;
    private int[] marks;

    public Human (String name) {
        this.name = name;
    }

    public Human (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human (String name, String lastName, int age, int[] marks) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.marks = marks;
    }

    public Human () {
        this.name = "Default name";
        this.lastName = "Default last name";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int calcMax() {
        int max = Integer.MIN_VALUE;
        for(int mark: marks) {
            if(max <= mark) {
                max = mark;
            }
        }
        return max;
    }

    public double sum() {
        double sum = 0d;
        for(double mark: marks) {
            sum += mark;
        }

        return sum;
    }

    public double calcAvg() {
        return sum() / marks.length;
    }
}
