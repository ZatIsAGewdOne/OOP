package Java2;

import java.util.Scanner;

public class HoursToMinutes {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Po kiek valandu per savaite treniruojasi Andrius?");
        System.out.println("Pirmadienio laikas: ");
        double mon = scanner.nextDouble();
        System.out.println("Antradienio laikas: ");
        double tue = scanner.nextDouble();
        System.out.println("Treciadienio laikas: ");
        double wed = scanner.nextDouble();
        System.out.println("Ketvirtadienio laikas: ");
        double thu = scanner.nextDouble();
        System.out.println("Penktadienio laikas: ");
        double fri = scanner.nextDouble();

        System.out.println("Per savaite Andrus treniruojasi " + minutesValue(mon+tue+wed+thu+fri) + " minuciu");
    }

    private static int minutesValue(double val) {
        return (int) Math.floor((val * 60));
    }
}
