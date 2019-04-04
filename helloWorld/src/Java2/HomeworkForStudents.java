package Java2;

import java.util.Scanner;

public class HomeworkForStudents {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter first value: ");
        int val1 = scanner.nextInt();
        System.out.println("Please enter second value: ");
        int val2 = scanner.nextInt();
        System.out.println("The answer to exercise one is " + exerciseOne(val1, val2)
                            + "\nThe answer to exercise two is " + exerciseTwo(val1, val2)
                            + "\nThe answer to exercise three is " + exerciseThree(val1, val2));
    }

    private static int exerciseOne(int a, int b) {
        return (a * b) + 3;
    }

    private static int exerciseTwo(int a, int b) {
        return a + b;
    }

    private static int exerciseThree(int a, int b) {
        return a - b;
    }
}
