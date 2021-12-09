package ru.mirea.task26;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskDemo {
    private static final List<RussianCurrency> priceOnProducts = new ArrayList<>();
    private static final Scanner READER = new Scanner(System.in);

    private static PaymentStrategy strategy;

    static {
        priceOnProducts.add(new RussianCurrency(15_000, 0));
        priceOnProducts.add(new RussianCurrency(55_000, 0));
        priceOnProducts.add(new RussianCurrency(40_000, 0));
        priceOnProducts.add(new RussianCurrency(2_000, 0));
    }

    public static void main(String[] args) throws IOException {
        RussianCurrency cost;
        RussianCurrency totalCost = new RussianCurrency(0, 0);

        String continueChoice;
        do {
            System.out.print("""
                    Please, select a product:
                    1 - Dishwasher
                    2 - Refrigerator
                    3 - Oven
                    4 - Rubbish bin
                    """);
            int choice = READER.nextInt();
            cost = priceOnProducts.get(choice - 1);
            System.out.print("Enter count: ");
            int count = READER.nextInt();
            READER.nextLine();
            totalCost = totalCost.add(
                    new RussianCurrency(cost.rubles() * count, cost.kopecks() * count));
            System.out.print("Do you want to select another products: Y/N ");
            continueChoice = READER.nextLine();
        } while (continueChoice.equalsIgnoreCase("Y"));

        if (strategy == null) {
            System.out.println("""
                    Please, select a payment method:
                    1 - YandexPay
                    2 - Credit Card""");
            String paymentMethod = READER.nextLine();

            if (paymentMethod.equals("1")) {
                strategy = new PaymentByYandexPay();
            } else {
                strategy = new PaymentByCreditCard();
            }
        }

        strategy.getPaymentDetails();
        if (strategy.makePayment(totalCost)) {
            System.out.println("Payment has been successful.");
        } else {
            System.out.println("FAIL! Please, check your data.");
        }
    }
}
