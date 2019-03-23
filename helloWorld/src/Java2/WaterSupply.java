package Java2;

import java.util.Scanner;

public class WaterSupply {
    /**
     * Vandens saugykloje yra v kubinių metrų vandens (realusis skaičius).
     * Saugyklos vandenį vartoja n žmonių. Vienas žmogus per parą vidutiniškai sunaudoja vv kubinių metrų vandens (realusis skaičius).
     * Parašykite programą, kuri apskaičiuotų, kelioms paroms p užteks saugykloje esančio vandens.
     * Pasitikrinkite: kai v = 1001, n = 50, vv = 0.1, tai p = 200.2.
     */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How much water is in the tank?");
        double tank = scanner.nextDouble();
        System.out.println("How many people are using it");
        int people = scanner.nextInt();
        System.out.println("What is their water usage?");
        double usage = scanner.nextDouble();
        System.out.println("You have enough water for " + waterForHours(tank, people, usage) + " days!");
    }

    private static double waterForHours(double amountOFWater, int people, double waterUsage) {
        return (amountOFWater / people) / waterUsage;
    }
}
