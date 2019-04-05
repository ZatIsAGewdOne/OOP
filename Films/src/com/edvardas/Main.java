package com.edvardas;

import java.io.*;
import java.util.Arrays;

public class Main {

    /**
     * @param file Passing a file to be read
     * @return Returns an array of films
     */

    static Film[] read(String file) {

        // Creating array of films and film placeholder object

        Film[] arr = new Film[0];
        Film obj = new Film();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Starts reading document

            String line = br.readLine();
            while(line != null) {
                String[] splitLine = line.split("\\s+");

                // Checking to see how many strings are in a line and sets object's fields

                if(splitLine.length == 7) {

                    obj.setProductionYear(Integer.parseInt(splitLine[0]));
                    obj.setName(splitLine[1] + " " +splitLine[2] + " " + splitLine[3]);
                    obj.setPlayTimeHour(Integer.parseInt(splitLine[4]));
                    obj.setPlayTimeMinutes(Integer.parseInt(splitLine[5]));
                    obj.setViewerCount(Integer.parseInt(splitLine[6]));

                } else if (splitLine.length == 6) {

                    obj.setProductionYear(Integer.parseInt(splitLine[0]));
                    obj.setName(splitLine[1] + " " + splitLine[2]);
                    obj.setPlayTimeHour(Integer.parseInt(splitLine[3]));
                    obj.setPlayTimeMinutes(Integer.parseInt(splitLine[4]));
                    obj.setViewerCount(Integer.parseInt(splitLine[5]));

                } else {

                    obj.setProductionYear(Integer.parseInt(splitLine[0]));
                    obj.setName(splitLine[1]);
                    obj.setPlayTimeHour(Integer.parseInt(splitLine[2]));
                    obj.setPlayTimeMinutes(Integer.parseInt(splitLine[3]));
                    obj.setViewerCount(Integer.parseInt(splitLine[4]));

                }

                // Adds the pre-set object to the array and resets the object

                arr = addElement(arr, obj);
                obj = new Film();
                line = br.readLine();
            }
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

        return arr;
    }

    /**
     * @param file Passing a file to be written
     * @param arr Passing an array of films
     */

    static void write(String file, Film[] arr) {
        Films arrOfFilms = new Films(arr);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(arrOfFilms.toString());
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong;"
            );
            e.fillInStackTrace();
        }
    }

    /**
     * @param arr Passing an array
     * @param obj Passing an object
     * @return Returns a copy of an array with the new object
     */

    static Film[] addElement(Film[] arr, Film obj) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = obj;
        return arr;
    }

    public static void main(String[] args) {
	    String file = new File("").getAbsolutePath() + "/src/com/edvardas/data.txt";
	    String result = new File("").getAbsolutePath() + "/src/com/edvardas/results.txt";
	    Film[] arrOfFilms = read(file);
	    write(result, arrOfFilms);

    }
}
