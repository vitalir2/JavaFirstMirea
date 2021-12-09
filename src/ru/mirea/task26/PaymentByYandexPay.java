package ru.mirea.task26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaymentByYandexPay implements PaymentStrategy {
    private static final Map<String, String> DATABASE = new HashMap<>();
    private static final Scanner READER = new Scanner(System.in);

    static {
        DATABASE.put("qwerty", "lorem@gmail.com");
        DATABASE.put("123456", "me@ya.ru");
    }

    private boolean signedIn;

    @Override
    public void getPaymentDetails() {
        String enteredEmail;
        String enteredPassword;
        while (!signedIn) {
            System.out.print("Enter the email: ");
            enteredEmail = READER.nextLine();
            System.out.print("Enter the password: ");
            enteredPassword = READER.nextLine();
            if (verify(enteredEmail, enteredPassword)) {
                System.out.println("Authentication has been completed successfully.");
            } else {
                System.out.println("Wrong email or password!");
            }
        }
    }

    private boolean verify(String email, String password) {
        signedIn = email.equals(DATABASE.get(password));
        return signedIn;
    }

    @Override
    public boolean makePayment(RussianCurrency paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using Yandex Pay..");
            return true;
        } else {
            return false;
        }
    }
}
