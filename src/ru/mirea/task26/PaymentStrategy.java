package ru.mirea.task26;

public interface PaymentStrategy {
    boolean makePayment(RussianCurrency paymentAmount);

    void getPaymentDetails();
}
