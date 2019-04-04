package com.edvardas;

import java.io.*;

public class Main {

    static Tires[] read(String file) {
        Tires[] arr = null;
        Tires initialTire = new Tires();
        int amountOfTires;
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            // First line
            String line = br.readLine();
            String[] splitValues = line.split(" ");
            initialTire.setName(splitValues[0] + " " + splitValues[1] + " " + splitValues[2]);
            // Second line
            line = br.readLine();
            splitValues = line.split("");
            amountOfTires = Integer.parseInt(splitValues[0]);
            arr = new Tires[amountOfTires];
            // Third line and later
            line = br.readLine();
            for(int i = 0; i < amountOfTires; i++) {
                splitValues = line.split(" ");
                String otherTiresNames = splitValues[0] + " " + splitValues[1] + " " + splitValues[2];
                double priceValue = Double.parseDouble(splitValues[3]);
                Tires obj = new Tires(otherTiresNames, priceValue);
                arr[i] = obj;
                line = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );
        }

        return arr;
    }

    static void write(String file, Tires[] arr) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Valid tire count: " + findTire(arr));
            bw.write("\nTotal cost of valid tires: " + priceTire(arr) + "\u20ac");
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );
            e.fillInStackTrace();
        }
    }

    static int findTire(Tires[] arr) {
        int count = 0;
        Tires checkTire = new Tires();
        checkTire.setName(arr[0].getName());
        for(Tires obj: arr) {
            if(checkTire.getName().equals(obj.getName())) {
                count++;
            }
        }

        return count;
    }

    static double priceTire(Tires[] arr) {
        double sum = 0d;
        Tires checkTire = new Tires();
        checkTire.setName(arr[0].getName());
        for(Tires obj: arr) {
            if(checkTire.getName().equals(obj.getName())) {
                sum += obj.getPrice();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
	    String file = new File("").getAbsolutePath() + "/src/com/edvardas/data.txt";
        Tires[] arrayOfTires = read(file);
        String results = new File("").getAbsolutePath() + "/src/com/edvardas/results.txt";
        write(results, arrayOfTires);
    }

}
