package com.edvardas.Arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTopic {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4};
        num = addElement(num, 8);
        for (Integer nums: num) {
            System.out.print(nums);
        }
    }

    private static Integer[] addElement(Integer[] arr, Integer number) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = number;
        return arr;
    }

    private static Integer[] addElementByIndex(Integer[] arr, Integer number, Integer index) {
        Integer[] tmp = new Integer[arr.length + 1];
        int indexInArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                tmp[indexInArray++] = number;
            }
            tmp[indexInArray++] = arr[i];
        }
        return tmp;
    }


}

