package com.edvardas;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/com/edvardas/Lorem Ipsum.txt";
    }

    private static void read(String file) {
        String allLines = "";
        String fileFinal = new File("").getAbsolutePath() + "/src/com/edvardas/result.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();

            while (line != null) {
                allLines += line;
                System.out.println(line);
                line = br.readLine();
            }

            write(fileFinal, allLines);
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found"
            );
        } catch (Exception e) {
            System.out.println(
                    "Error! " + e
            );
        }
    }

    private static void write(String file, String allLines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(allLines.split(" ").length + "\n");
            bw.write(allLines);
        } catch (Exception e) {
            System.out.println(
                    "Error! " + e
            );
        }
    }
}
