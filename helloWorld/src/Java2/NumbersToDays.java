package Java2;

import java.util.Scanner;

public class NumbersToDays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 7: ");
        try {
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("You chose Monday");
                    break;

                case 2:
                    System.out.println("You chose Tuesday");
                    break;

                case 3:
                    System.out.println("You chose Wednesday");
                    break;

                case 4:
                    System.out.println("You chose Thursday");
                    break;

                case 5:
                    System.out.println("You chose Friday");
                    break;

                case 6:
                    System.out.println("You chose Saturday");
                    break;

                case 7:
                    System.out.println("You chose Sunday");
                    break;

                default:
                    System.out.println("Day not found!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid value");
        }


    }
}
