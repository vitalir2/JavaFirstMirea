package ru.mirea.task26;

import java.util.Scanner;

public class PaymentByCreditCard implements PaymentStrategy {
    private static final Scanner READER = new Scanner(System.in);

    private CreditCard card;

    @Override
    public void getPaymentDetails() {
        System.out.print("Enter the card number: ");
        String number = READER.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = READER.nextLine();
        System.out.print("Enter the CVV: ");
        String cvv = READER.nextLine();
        card = new CreditCard(number, date, cvv, new RussianCurrency(100_000, 0));
    }

    @Override
    public boolean makePayment(RussianCurrency paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Try paying " + paymentAmount + " using credit card..");
            if (card.balance().compareTo(paymentAmount) < 0) {
                System.out.println("Not enough money on user's card");
            } else {
                System.out.println("Payment was successful");
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
