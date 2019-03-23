package Java2;

import java.util.Scanner;

public class RoadTrip {

    /**
     *
     * Automobilis 100 km sunaudoja k litrų kuro (realusis skaičius).
     * Į m kilometrų kelionę (realusis skaičius) išsirengė n žmonių.
     * Kiek litų s kainuos kelionė vienam žmogui, jei vienas litras kuro kainuoja kk (realusis skaičius) litų.
     * Pasitikrinkite: kai k = 7.5, m = 305.5, n = 4, kk = 4.09, tai s = 23.4.
     *
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("What is your mileage?");
            double mileage = scanner.nextDouble();
            System.out.println("What is your distance?");
            double distance = scanner.nextDouble();
            System.out.println("How many people will be on this trip?");
            int people = scanner.nextInt();
            System.out.println("How much does fuel cost?");
            double fuel = scanner.nextDouble();

            System.out.println("**** Your trip will cost " + cost(mileage, distance, people, fuel)
                                + " euro per person! ****");
        } catch (Exception e) {
            System.out.println("Invalid value! You must enter a number");
        }
    }

    private static double cost(double litresPerKilo, double distance, int people, double euroPerKilo) {
        return (litresPerKilo * distance * euroPerKilo / people) / 100;
    }
}
