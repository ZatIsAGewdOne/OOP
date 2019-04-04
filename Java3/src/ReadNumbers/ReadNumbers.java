package ReadNumbers;

import java.io.*;

public class ReadNumbers {
    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/ReadNumbers/data.txt";
        read(file);
    }

    private static void read(String file) {
        int[] arr = new int[9];
        int index = 0;
        String file2 = new File("").getAbsolutePath() + "/src/ReadNumbers/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();

            while(line != null) {
                String[] lineNumber = line.split(" ");
                for (int i = 0; i < lineNumber.length; i++) {
                    arr[index] = Integer.parseInt(lineNumber[i]);
                    index++;
                }
                line = br.readLine();
            }
            write(file2, arr);
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );
        } catch (Exception e) {
            System.out.println(
                    "Error! " + e
            );
        }
    }

    private static void write(String file, int[] numbers) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file))){
            for (Integer number: numbers) {
                output.write(number.toString() + "\n");
            }

        } catch (Exception e) {
            System.out.println(
                    "Error while creating file!"
            );

            e.printStackTrace();
        }
    }
}
