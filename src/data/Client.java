package data;

public class Client {
    private String name;
    private String surname;
    private boolean isClient;
    private Card card;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.isClient = true;
        this.card = new Card();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isClient() {
        return isClient;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

