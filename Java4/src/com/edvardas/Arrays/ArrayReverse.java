package com.edvardas.Arrays;

import java.io.*;
import java.util.Arrays;

public class ArrayReverse {

    private static void read(String file) {
        Integer[] numbers = new Integer[0];
        String result = new File("").getAbsolutePath() + "/src/com/edvardas/Arrays/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null) {
                String[] splitNumbers = line.split(" ");
                for (int i = 0; i < splitNumbers.length; i++) {
                   numbers = addElement(numbers, Integer.parseInt(splitNumbers[i]));
                }
                line = br.readLine();
            }
            write(result, numbers);
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );
        } catch (Exception e) {
            System.out.println(
                    "Error!"
            );
        }
    }

    private static void write(String file, Integer[] numbers) {
        Integer sum;
        double avg;
        Integer[] moreThanAverage;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for (Integer number: numbers) {
                bw.write(number.toString() + " ");
            }
            sum = sum(numbers);
            avg = average(sum, numbers.length);
            bw.write("\n");

            for (int i = numbers.length - 1; i >= 0; i--) {
                bw.write(numbers[i].toString() + " ");
            }

            bw.write(
                    "\nThe sum of these numbers is " + sum
            );
            bw.write(
                    "\nThe average of these numbers is " + avg
            );

            bw.write("\n");
            moreThanAverage = moreThanAverage(numbers, avg);
            for (int i = 0; i < moreThanAverage.length; i++) {
                bw.write(moreThanAverage[i].toString() + " ");
            }

            Integer min = min(numbers);
            Integer max = max(numbers);

            bw.write(
                    "\nMinimum is "+ min + ", Maximum is " + max
            );

            Integer[] previousNumbers = new Integer[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                if (!itExists(previousNumbers, numbers[i])) {
                    previousNumbers = addElement(previousNumbers, numbers[i]);
                    Integer repeatCount = 1;
                    for (int j = i+1; j < numbers.length; j++) {
                        if (numbers[i] == numbers[j]) {
                            repeatCount++;
                        }
                    }

                    bw.write(
                            "\nNumber = " + numbers[i] + " repeated " + repeatCount + " times"
                    );
                }

            }

            bw.write("\n");

            Integer[] sortedArr = bubbleSort(numbers);

            for (int i = 0; i < sortedArr.length; i++) {
                bw.write(sortedArr[i] + " ");
            }

            bw.write("\n");

            sortedArr = bubbleSortDescend(numbers);

            for (int i = 0; i < sortedArr.length; i++) {
                bw.write(
                        sortedArr[i] + " "
                );
            }

        } catch (Exception e) {
            System.out.println(
                    "Error! " + e
            );
        }
    }

    private static Integer sum(Integer[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        return sum;
    }

    private static Double average(Integer sum, Integer arrLength) {
        return (double)sum / arrLength;
    }

    private static Integer[] moreThanAverage(Integer[] arr, Double average) {
        Integer[] moreThanAverage = new Integer[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > average) {
                moreThanAverage = addElement(moreThanAverage, arr[i]);
            }
        }

        return moreThanAverage;
    }

    private static Integer min(Integer[] arr) {
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    private static Integer max(Integer[] arr) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    private static Boolean itExists(Integer[] arr, Integer checkNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber == arr[i]) {
                return true;
            }
        }

        return false;
    }

    private static Integer[] bubbleSort(Integer[] arr) {
        int temp;
        boolean isSorted;
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            isSorted = true;
            for (int j = 1; j < (arrLength - i); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }

            }

            if (isSorted) break;
        }

        return arr;
    }

    private static Integer[] bubbleSortDescend(Integer[] arr) {
        int temp;
        boolean isSorted;
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            isSorted = true;
            for (int j = 1; j < (arrLength - 1); j++) {
                if (arr[j-1] < arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) break;
        }

        return arr;
    }

    private static Integer[] addElement(Integer[] arr, Integer number) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = number;
        return arr;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/Arrays/data.txt";
        read(file);
    }
}
