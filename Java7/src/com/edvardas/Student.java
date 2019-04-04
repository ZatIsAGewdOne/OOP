package com.edvardas;

import java.util.Arrays;

public class Student {
    private String name;
    private String lastName;
    private int grade;
    private int[] marks;

    public Student() {
        this.name = "Default name";
        this.lastName = "Default lastName";
        this.grade = 8;
    }

    public Student(String name, String lastName, int grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double calcSum() {
        double sum = 0d;
        if (marks != null) {
            for(double mark: marks) {
                sum += mark;
            }
        }

        return sum;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public double calcAvg() {
        double avg = 0;
        if(marks != null) return avg = calcSum() / marks.length;

        return avg;
    }
}
