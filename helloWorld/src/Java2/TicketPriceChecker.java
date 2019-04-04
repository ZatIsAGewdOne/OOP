package Java2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPriceChecker {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter ticket price: ");
        double ticket = scanner.nextDouble();
        System.out.println("Enter the age of the elderly: ");
        int age = scanner.nextInt();
        priceCheck(ticket, age);
    }

    private static void priceCheck(double ticketPrice, int elderAge) {
        double studentTicket = ticketPrice * 50 / 100;
        double elderTicket;

        if(elderAge >= 70) {
            elderTicket = ticketPrice * 25 / 100;
            System.out.println("Due to being over the age of 70. You get 75% discount");
        } else {
            elderTicket = ticketPrice * 50 / 100;
            System.out.println("Due to being less than the age of 70. You only get a 50% discount");
        }

        System.out.println("With the price of a ticket being " + ticketPrice + "\u20ac"
                            + "\nAfter discount student ticket costs: " + studentTicket + "\u20ac"
                            + "\nAfter discount elderly ticket costs: " + elderTicket + "\u20ac");
    }
}
