package Java2;

import java.util.Scanner;

public class ChocolateForAll {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("How many students are in your group?");
            int students = scanner.nextInt();
            System.out.println("How much does the first brand of chocolate cost?");
            double chocolate1 = scanner.nextDouble();
            System.out.println("How much doest the second brand of chocolate cost?");
            double chocolate2 = scanner.nextDouble();
            System.out.println("How much doest the third brand of chocolate cost?");
            double chocolate3 = scanner.nextDouble();
            chocolateCost(chocolate1, chocolate2, chocolate3, students);
        } catch (Exception e) {
            System.out.println("Invalid value. You must use real numbers");
        }
    }

    private static void chocolateCost(double firstBrand, double secondBrand, double thirdBrand, int amountOfStudents) {
        double sum1, sum2, sum3;
        double chocolateAmount = 100d,
            chocolateAmountSecond = 25d,
            chocolateAmountThird = 50d;

        sum1 = firstBrand * amountOfStudents;
        sum2 = secondBrand * amountOfStudents * (chocolateAmount / chocolateAmountSecond);
        sum3 = thirdBrand * amountOfStudents * (chocolateAmount / chocolateAmountThird);

        if (sum1 < sum2 && sum1 < sum3) {
            System.out.println("First brand of chocolate is best choice! Teacher will only pay: " + sum1 + "\u20ac");
        } else if (sum2 < sum3) {
            System.out.println("Second brand of chocolate is best choice! Teacher will only pay: " + sum2 + "\u20ac");
        } else {
            System.out.println("Third brand of chocolate is best choice! Teacher will only pay: " + sum3 + "\u20ac");
        }

    }
}
