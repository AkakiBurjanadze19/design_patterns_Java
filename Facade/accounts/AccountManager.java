package Facade.accounts;

public class AccountManager {
    public void deposit(double amount) {
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw: $" + amount);
    }
}
