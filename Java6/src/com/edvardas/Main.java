package com.edvardas;

public class Main {

    static int getIndex(int[] arr, int index){
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index " + index + " not found!");
            return arr[arr.length - 1];
        }
    }

    static void parseException() {
        try {
            String str = "null";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            System.out.println("Invalid value");
        } catch (Exception e) {
            System.out.println("Something else went wrong!");
            e.fillInStackTrace();
        }
    }

    static char getChar(String word, int index) {
        try {
            if((index < 0) || (index >= word.length())) {
                throw new StringIndexOutOfBoundsException();
            }
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Invalid index of " + index + " at word" + word);
        }
        return word.toCharArray()[index];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = getIndex(arr, 8);
        String word = "test";
        System.out.println(getChar(word, 1));
        parseException();
    }
}
