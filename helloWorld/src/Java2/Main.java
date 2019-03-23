package Java2;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int x= s.nextInt();
        if(x % 2 == 0) {
            System.out.println("Skaicius " + x + " yra lyginis");
        } else {
            System.out.println("Skaicius " + x + " yra nelyginis");
        }
    }
}
