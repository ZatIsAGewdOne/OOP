package com.edvardas;

import Interfaces.Client;
import Interfaces.Employee;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("123456789", "Default");
        Client[] arr = new Client[] {
                new Client("CZ01", "Name1", new double[]{1d, 3d, 5d, 7d}),
                new Client("LT1", "AnotherName", new double[]{7d, 9d, 5d}),
                new Client("EST03", "AnotherAnotherName", new double[]{2d, 4d})
        };
        int mostPayments = getMostPayments(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(findClient(arr));
//        System.out.println(getMostPayments(arr));
//        System.out.println(paymentAverage(arr));
        double paymentAverage = paymentAverage(arr);
        System.out.println(paymentAverage);
        printClient(arr, paymentAverage);
        printMostPayments(arr, mostPayments);
    }

    static Client findClient(Client[] arr) {
        int max = 0;
        int index= 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].payments() < max) {
                max = arr[i].payments();
                index = i;
            }
        }

        return arr[index];
    }

    static int getMostPayments(Client[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i].getPayments().length) {
                max = arr[i].getPayments().length;
            }
        }

        return max;
    }

    static double paymentAverage(Client[] arr) {
        double sum = 0;
        int paymentAmount = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].getPayments().length; j++) {
                sum += arr[i].getPayments()[j];
            }

            paymentAmount += arr[i].getPayments().length;
        }

        return sum / paymentAmount;
    }

    static void printMostPayments(Client[] arr, int mostPayments) {
        for(int i = 0; i < arr.length; i++) {
            if(mostPayments == arr[i].getPayments().length) {
                System.out.println(arr[i]);
            }
        }
    }

    static void printClient(Client[] arr, double average) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].getPayments().length; j++) {
                if(arr[i].getPayments()[j] > (average * 2)) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
