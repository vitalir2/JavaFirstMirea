package ru.mirea.task26;

public record CreditCard(String number, String expireDate, String cvv, RussianCurrency balance) {
}

record RussianCurrency(int rubles, int kopecks) implements Comparable<RussianCurrency> {
    RussianCurrency add(RussianCurrency other) {
        int rublesSum = this.rubles + other.rubles;
        int kopecksSum = this.kopecks + other.kopecks;
        if (kopecksSum > 100) {
            return new RussianCurrency(rublesSum + 1, kopecksSum % 100);
        }
        return new RussianCurrency(rublesSum, kopecksSum);
    }

    @Override
    public String toString() {
        return "RussianCurrency{" +
                "rubles=" + rubles +
                ", kopecks=" + kopecks +
                '}';
    }

    @Override
    public int compareTo(RussianCurrency other) {
        if (this.rubles == other.rubles) {
            return Integer.compare(this.kopecks, other.kopecks);
        }
        return Integer.compare(this.rubles, other.rubles);
    }
}