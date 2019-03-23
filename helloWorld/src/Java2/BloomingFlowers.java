package Java2;

import java.util.Scanner;

public class BloomingFlowers {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int initFlowers, flowersPerDay, days;
        try {

            System.out.println("How many flowers are blooming initially?");
            initFlowers = scanner.nextInt();
            System.out.println("How many flowers are blooming per day?");
            flowersPerDay = scanner.nextInt();
            System.out.println("How many days have passed?");
            days = scanner.nextInt();
            System.out.println("You have " + initFlowers + " flowers blooming initially");
            System.out.println("In " + days + " days you have " + (initFlowers + flowersPerDays(flowersPerDay, days)
                                + " flowers blooming."));
        } catch (Exception e) {
            System.out.println("Invalid value! You must enter a whole number");
        }
    }

    private static int flowersPerDays(int flowers, int days) {
        return flowers * days;
    }
}
