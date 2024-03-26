package bank;

import data.Client;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void welcomeMessage() {
        System.out.println("Добро пожаловать в банк " + name + "!");
    }

    public void serveClient(Client client) {
        if (client.isClient()) {
            System.out.println("Обслуживание клиента " + client.getName() + " " + client.getSurname());
        } else {
            System.out.println("Ошибка: клиент не идентифицирован.");
        }
    }
}
