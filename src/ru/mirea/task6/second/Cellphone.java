package ru.mirea.task6.second;

public class Cellphone implements Priceable {

    private static final int PRICE_FOR_GIGABYTE_DOLLARS = 2;
    private int memorySizeGb;

    public int getMemorySizeGb() {
        return memorySizeGb;
    }

    public void setMemorySizeGb(int memorySizeGb) {
        this.memorySizeGb = memorySizeGb;
    }

    public Cellphone(int memorySizeGb) {
        this.memorySizeGb = memorySizeGb;
    }

    @Override
    public double getPrice() {
        return memorySizeGb * PRICE_FOR_GIGABYTE_DOLLARS;
    }
}
