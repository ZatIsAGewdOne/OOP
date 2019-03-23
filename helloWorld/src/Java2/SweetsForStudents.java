package Java2;

import java.util.Scanner;

public class SweetsForStudents {
    /**
     * Mokinys per pusmetį gavo 5 programavimo pradmenų modulio pažymius. Mokytoja
     * nusprendė padaryti vaikams staigmeną: mokiniai, kurių pažymių vidurkis yra didesnis už
     * 9, gaus tris saldainius, o mokiniams, kurių vidurkis yra tarp 7 ir 9, įskaitant intervalo galus,
     * bus apdovanoti dviem saldainiais. Visi likusieji gaus po vieną saldainį.
     */

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter first mark: ");
        int mark1 = scanner.nextInt();
        System.out.println("Second mark: ");
        int mark2 = scanner.nextInt();
        System.out.println("Third mark: ");
        int mark3 = scanner.nextInt();
        System.out.println("Fourth mark: ");
        int mark4 = scanner.nextInt();
        System.out.println("Fifth mark: ");
        int mark5 = scanner.nextInt();
        int sum = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = (double) sum / 5;

        if (average > 9) {
            System.out.println("Student gets three pieces of candy");
        } else if (average >= 7 && average <= 9) {
            System.out.println("Student gets two pieces of candy");
        } else {
            System.out.println("Student gets one piece of candy");
        }
    }
}
