package data;

import java.util.Random;

public class Card {
    private final String CARD_NUMBER;
    private int pinCode;

    public Card() {
        this.CARD_NUMBER = generateCardNumber();
        this.pinCode = generatePinCode();
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        // Ограничение на 4 цифры
        if (String.valueOf(pinCode).length() == 4) {
            this.pinCode = pinCode;
        } else {
            System.out.println("Пин-код должен содержать 4 цифры.");
        }
    }

    private String generateCardNumber() {
        // Генерация номера карты (просто для примера)
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private int generatePinCode() {
        // Генерация пин-кода (просто для примера)
        Random random = new Random();
        return random.nextInt(10000);
    }
}

