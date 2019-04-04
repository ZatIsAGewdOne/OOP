package com.edvardas;

import java.util.Arrays;

public class Main {

    private static void printArr(int[] arr, String name) {
        System.out.println(name);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static double sum(double a, double b) {
        return a+b;
    }

    private static void oddOrEven(int num) {
        if(num % 2 == 0) {
            System.out.println(
                    "Number " + num + " is odd"
            );
        } else {
            System.out.println(
                    "Number " + num + " is even"
            );
        }
    }

    private static int arrSum(int[] arr) {
        int sum = 0;
        for (int number: arr) {
            sum+=number;
        }

        return sum;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    private static int[] moreThanTen(int[] arr) {
        int[] lessThanTen = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10) {
                lessThanTen = addElement(lessThanTen, arr[i]);
            }
        }

        return lessThanTen;
    }

    private static int[] addElement(int[] arr, int number) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = number;
        return arr;
    }

    private static String longestWord(String[] words) {
        int longestWordLength = 0;
        int longestWordIndex = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > longestWordLength) {
                longestWordLength = words[i].length();
                longestWordIndex = i;
            }
        }

        return words[longestWordIndex];
    }

    private static char findChar(String word) {
        int wordLength = word.length();
        int midChar = wordLength / 2;
        return word.charAt(midChar);
    }

    public static void main(String[] args) {
	    int[] numbers = {2,3,4,5,8,9,7,10};
	    String[] words = {"yes", "no", "hello", "world", "lorem", "whatsup"};
        System.out.println(longestWord(words));
	    int sum = arrSum(numbers);
	    int min = findMin(numbers);
	    int[] moreThanTen = moreThanTen(numbers);
        System.out.println(findChar(words[5]));
        System.out.println("Min of this array is " + min);
        System.out.println("Sum of this array is " + sum);
	    printArr(moreThanTen, "More than ten array");
	    double res = sum(5, 6);
        System.out.println("\n" + res);

        oddOrEven(6);
    }
}
