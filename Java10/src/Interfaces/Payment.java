package Interfaces;

public interface Payment {
    String bankAccount();
    String accountOwner();

    default double sum(double number1, double number2) {
        return number1 + number2;
    }
}
