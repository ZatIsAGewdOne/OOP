package Java2;

import java.util.Scanner;

public class LargestNumber {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Integer number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        Integer number2 = scanner.nextInt();
        System.out.println("Please enter third number: ");
        Integer number3 = scanner.nextInt();

        if(number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the largest number");
        } else if(number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the largest number");
        } else {
            System.out.println(number3 + " is the largest number");
        }
    }
}
