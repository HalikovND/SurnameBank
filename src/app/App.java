package app;

import bank.ATM;
import bank.Bank;
import data.Client;

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        bank.welcomeMessage();

        Client client = new Client("John", "Doe");
        ATM atm = new ATM();

        atm.insertCard(client);
        atm.enterPinCode(client.getCard().getPinCode());
        atm.checkBalance();
        atm.withdrawCash(100);
        atm.depositCash(200);
        atm.ejectCard();

        bank.serveClient(client);
    }
}