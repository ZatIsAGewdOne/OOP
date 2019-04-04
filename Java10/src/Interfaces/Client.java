package Interfaces;

public class Client implements Payment {

    private String bankAccount;
    private String accountOwner;
    private double[] payments;

    public Client(String bankAccount, String accountOwner, double[] payments) {
        this.bankAccount = bankAccount;
        this.accountOwner = accountOwner;
        this.payments = payments;
    }

    @Override
    public String bankAccount() {
        return bankAccount;
    }

    @Override
    public String accountOwner() {
        return accountOwner;
    }

    @Override
    public String toString() {
        return "Client: " + accountOwner()  + " Bank account: " + bankAccount() + " Payment amount " + getPayments().length;
    }

    public double[] getPayments() {
        return payments;
    }

    public int payments() {
        return getPayments().length;
    }
}
