package com.edvardas;

import java.io.*;
import java.util.Arrays;

public class Main {

    private static void read(String file) {
        Double[] numbers = new Double[0];
        String result = new File("").getAbsolutePath() + "/src/com/edvardas/result.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();

            while (line != null) {
                String[] splitNumbers = line.split(" ");
                for (int i = 0; i < splitNumbers.length; i++) {
                    numbers = addElement(numbers, Double.parseDouble(splitNumbers[i]));
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
                    "Error! \n" + e
            );
        }
    }

    private static void write(String file, Double[] numbers) {
        double rate = numbers[1];
        double sum = 0;
        double avg;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            for (double i = 2; i < numbers.length; i++) {
                sum += (rate * numbers[(int)i] * 1.0);
                bw.write(((int)i-1) + ". " + (rate * numbers[(int)i] * 1.0) + "\u20ac\n");
            }

            avg = sum / (numbers.length - 2);

            bw.write("\nThe sum of the rent is " + (sum) + "\u20ac");
            bw.write("\nOne person will pay the average of " + avg + "\u20ac");
        } catch (Exception e) {
            System.out.println(
                    "Error! \n" + e
            );
        }
    }

    private static Double[] addElement(Double[] arr, Double number) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = number;
        return arr;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/data.txt";
        read(file);
    }
}
