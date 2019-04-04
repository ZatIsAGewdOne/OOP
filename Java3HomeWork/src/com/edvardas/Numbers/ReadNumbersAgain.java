package com.edvardas.Numbers;

import java.io.*;

public class ReadNumbersAgain {
    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/Numbers/data.txt";
        read(file);
    }

    private static void read(String file) {
        int[] arr = new int[9];
        int index = 0;
        String numberFile = new File("").getAbsolutePath() + "/src/com/edvardas/Numbers/numberFile.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();

            while (line != null) {
                String[] lineNumber = line.split(" ");
                for (int i = 0; i < lineNumber.length; i++) {
                    arr[index] = Integer.parseInt(lineNumber[i]);
                    index++;
                }
                System.out.println(line);
                line = br.readLine();
            }

            write(numberFile, arr);
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

    private static void write(String file, int[] numbers) {
        int sum = 0;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for(Integer number: numbers) {
                sum += number;
                if (number % 2 == 0) {
                    bw.write(number.toString() + " is even\n");
                } else {
                    bw.write(number.toString() + " is odd\n");
                }
            }
            Double avg = (double) sum / numbers.length;
            bw.write("Average of this array is: " + avg.toString());
        } catch (Exception e) {
            System.out.println(
                    "Error! \n" + e
            );
        }
    }
}
