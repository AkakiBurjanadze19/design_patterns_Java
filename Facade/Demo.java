package Facade;

import Facade.client.Bank;

public class Demo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.performTransaction("akaki", "1234", 5000);
    }
}
