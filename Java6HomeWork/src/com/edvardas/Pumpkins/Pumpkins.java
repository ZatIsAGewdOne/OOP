package com.edvardas.Pumpkins;

import java.io.*;
import java.util.Arrays;

public class Pumpkins {
    private static void read(String file) {
        Double[] pumpkins = new Double[0];
        String result = new File("").getAbsolutePath() + "/src/com/edvardas/Pumpkins/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while(line != null) {
                String[] lineItem = line.split(" ");
                for (int i = 0; i < lineItem.length; i++) {
                    pumpkins = addElement(pumpkins, Double.parseDouble(lineItem[i]));
                }

                line = br.readLine();
            }
            write(result, pumpkins);
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Error! '" + file + "' not found!\n" + ex
            );
        } catch (Exception e) {
            System.out.println(
                    "Error! \n" + e
            );
        }
    }

    private static void write(String file, Double[] arr) {
        Double average;
        Double[] viablePumpkins = printViablePumpkins(arr);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            average = averageWeight(arr);
            bw.write("\nAverage weight of all pumpkins is " + average.toString() + " kg.");
            bw.write("\nViable pumpkins for sale is " + viablePumpkins(arr));
            bw.write("\nAverage weight of all viable pumpkins is " + averageWeightOfViablePumpkins(arr) + " kg.");
            bw.write("\nViable pumpkin weights are: ");
            for (int i = 0; i < viablePumpkins.length; i++) {
                bw.write(viablePumpkins[i].toString() + "kg ");
            }
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

    private static Double averageWeight(Double[] arr) {
        Double sum = 0d;
        int index = 3;
        for(int i = index; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum / (arr.length - index);
    }

    private static Integer viablePumpkins(Double[] arr) {
        Integer viablePumpkinsCount = 0;
        for(int i = 3; i < arr.length; i++) {
            if(arr[1] <= arr[i] && arr[2] >= arr[i]) {
                viablePumpkinsCount++;
            }
        }

        return viablePumpkinsCount;
    }

    private static Double averageWeightOfViablePumpkins(Double[] arr) {
        int viablePumpkinsCount = 0;
        Double sum = 0d;
        for(int i = 3; i < arr.length; i++) {
            if(arr[1] <= arr[i] && arr[2] >= arr[i]) {
                sum+=arr[i];
                viablePumpkinsCount++;
            }
        }

        if (viablePumpkinsCount == 0) return null;

        return sum / (double)viablePumpkinsCount;
    }

    private static Double[] printViablePumpkins(Double[] arr) {
        Double[] viablePumpkins = new Double[0];
        for(int i = 3; i < arr.length; i++) {
            if(arr[1] <= arr[i] && arr[2] >= arr[i]) {
                viablePumpkins = addElement(viablePumpkins, arr[i]);
            }
        }

        return viablePumpkins;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/Pumpkins/data.txt";
        read(file);
    }
}
