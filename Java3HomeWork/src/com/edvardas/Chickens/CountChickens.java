package com.edvardas.Chickens;

import java.io.*;

public class CountChickens {
    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/Chickens/data.txt";
        read(file);

        int[] arr1 = {42, 47, 40, 52};
        int[] arr2 = {5, 6, 5, 4};

        for (int i = 0; i<arr1.length; i++) {
            System.out.println(
                    "Chicken " + (i+1) + " weighs " + arr1[i] + " kilos and age is " + arr2[i]
            );
        }
    }

    private static void read(String file) {
        int[] numbers = new int[9];
        int index = 0;
        String result = new File("").getAbsolutePath() + "/src/com/edvardas/Chickens/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null) {
                String[] lineItem = line.split(" ");
                for (int i = 0; i < lineItem.length; i++) {
                    numbers[index] = Integer.parseInt(lineItem[i]);
                    index++;
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

    private static void write(String file, int[] data) {
        int[] arr1 = new int[data[0]];
        int[] arr2 = new int[data[0]];
        int firstIndex = 1;
        int secondIndex = 2;
        int current = 0;
        int currentAge = 0;
        int index = 0;
        int indexAge = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = data[firstIndex];
            firstIndex+=2;
        }

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = data[secondIndex];
            secondIndex+=2;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for (int i = 0; i<arr1.length; i++) {
                bw.write(
                        "Chicken " + (i+1) + " weighs " + arr1[i] + " kilos and is the age of " + arr2[i] + "\n"
                );
            }

            for (int i = 0; i <arr1.length; i++) {
                if (current < arr1[i]) {
                    current = arr1[i];
                    index = i+1;
                }

                if (currentAge < arr2[i]) {
                    currentAge = arr2[i];
                    indexAge = i+1;
                }
            }
            bw.write("Heaviest chicken is " + index + "\n");

            bw.write("Oldest chicken is " + indexAge);

        } catch (Exception e) {
            System.out.println(
                    "Error! " + e
            );
        }
    }
}
