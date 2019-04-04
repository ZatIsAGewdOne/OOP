package Interfaces;

public class Employee implements Payment{

    private String bankAccount;
    private String accountOwner;

    public Employee(String bankAccount, String accountOwner) {
        this.bankAccount = bankAccount;
        this.accountOwner = accountOwner;
    }

    @Override
    public String toString() {
        return bankAccount() + " " + accountOwner();
    }

    @Override
    public String bankAccount() {
        return bankAccount;
    }

    @Override
    public String accountOwner() {
        return accountOwner;
    }

}
