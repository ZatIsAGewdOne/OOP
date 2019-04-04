package Java2;

import java.util.Scanner;

public class OnTime {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How long will you be walking?");
        int walking = scanner.nextInt();
        System.out.println("How long will you be running?");
        int running = scanner.nextInt();
        System.out.println("When is the bus leaving?");
        int bus = scanner.nextInt();
        System.out.println(willTheyMakeIt(walking, running, bus));
    }

    private static boolean willTheyMakeIt(int walkTime, int runTime, int busLeaves) {
        if(walkTime < busLeaves || runTime < busLeaves) {
            System.out.println("Person made it on time");
            return true;
        }

        System.out.println("Person missed their bus");
        return false;
    }
}
