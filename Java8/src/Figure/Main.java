package Figure;

import java.io.*;

public class Main {

    static void read(String file) {
        int length;
        int width;
        int diagonal;
        Figure square;
        Figure rectangle;
        Figure triangle;
        String results = new File("").getAbsolutePath() + "/src/Figure/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // First line

            String line = br.readLine();
            String[] splitLine = line.split(" ");
            length = Integer.parseInt(splitLine[0]);
            square = new Square(length);

            // Second line

            line = br.readLine();
            splitLine = line.split(" ");
            length = Integer.parseInt(splitLine[0]);
            width = Integer.parseInt(splitLine[1]);
            rectangle = new Rectangle(length, width);

            // Third line

            line = br.readLine();
            splitLine = line.split(" ");
            length = Integer.parseInt(splitLine[0]);
            width = Integer.parseInt(splitLine[1]);
            diagonal = Integer.parseInt(splitLine[2]);
            triangle = new Triangle(length, width, diagonal);

            // After reading file

            Figure[] arr = {square, rectangle, triangle};
            write(results, arr);

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

    static void write(String file, Figure[] arr) {
        Figures arrayOfFigures = new Figures(arr);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(arrayOfFigures.toString());
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/Figure/data.txt";
        read(file);
    }
}
