package bank;

import data.Client;

public class ATM {
    public void insertCard(Client client) {
        System.out.println("Карта вставлена.");
    }

    public void enterPinCode(int pinCode) {
        System.out.println("Пин-код введен: " + pinCode);
    }

    public void checkBalance() {
        System.out.println("Баланс: $1000");
    }

    public void withdrawCash(int amount) {
        System.out.println("Снято наличных: $" + amount);
    }

    public void depositCash(int amount) {
        System.out.println("Положено наличных: $" + amount);
    }

    public void ejectCard() {
        System.out.println("Карта извлечена. Не забудьте её забрать.");
    }
}
