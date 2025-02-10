package Facade.client;

import Facade.accounts.AccountManager;
import Facade.auth.Authentication;
import Facade.transactions.TransactionLogger;

public class Bank {
    private Authentication auth;
    private AccountManager account;
    private TransactionLogger logger;

    public Bank() {
        this.auth = new Authentication();
        this.account = new AccountManager();
        this.logger = new TransactionLogger();
    }

    public void performTransaction(String user, String password, double amount) {
        if (this.auth.verifyUser(user, password)) {
            this.account.deposit(amount);
            logger.log("User: " + user + ", deposited $" + amount);
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
