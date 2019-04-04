package BestInChallenge;

import java.io.*;
import java.util.Arrays;

public class BestChallenge {
    static void read(String file) {
        int studentCount;
        int sum = 0;
        int[] sumCount;
        String results = new File("").getAbsolutePath() + "/src/BestInChallenge/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // First line
            String line = br.readLine();
            studentCount = Integer.parseInt(line);
            sumCount = new int[studentCount];
            // Second line
            line = br.readLine();
            for(int i = 0; i < studentCount; i++) {
                String[] splitLine = line.split(" ");
                    for(int j = 0; j < splitLine.length; j++) {
                        sum += Integer.parseInt(splitLine[j]);
                    }
                sumCount[i] = sum;
                sum = 0;
                line = br.readLine();
            }

            write(results, sumCount);

        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );
            ex.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
    }

    static void write(String file, int[] arr) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i = 0; i < arr.length; i++) {
                bw.write("Student " + (i+1) + " did " + arr[i] + " challenges\n");
            }
            bw.write("\nA total of " + calcSum(arr) + " challenges were done.");
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
    }

    static int calcSum(int[] arr) {
        int sum = 0;
        for(int num:arr) {
            sum+=num;
        }

        return sum;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/BestInChallenge/data.txt";
        read(file);
    }
}
