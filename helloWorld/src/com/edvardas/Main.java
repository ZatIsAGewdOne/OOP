package com.edvardas;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter first value: \t");
        double value1 = scanner.nextDouble();
        System.out.println("Please enter second value: \t");
        double value2 = scanner.nextDouble();
        System.out.println("Sum of these values is " + calcSum(value1, value2));
        System.out.println("Area of this rectangle is " + calcArea(value1, value2));
        System.out.println("Perimeter of this rectangle is " + calcPerimeter(value1, value2));
    }

    private static int calcSum(int a, int b) {
        int sum = 0;
        if ((a > 0) && (b > 0)) {
            return sum = a + b;
        } else {
            System.out.println("One or both of your values are invalid");
        }

        return sum;
    }

    private static double calcSum(double a, double b) {
        double sum = 0;
        if((a < 0) && (b < 0)) {
            System.out.println("One or both of your values are invalid");
        }
        return a + b;
    }

    private static double calcArea(double a) {
        return a * a;
    }

    private static double calcArea(double a, double b) {
        return a * b;
    }

    private static double calcPerimeter(double a, double b) {
        return (a + b) * 2;
    }

}
