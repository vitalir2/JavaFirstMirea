package ru.mirea.task6.second;

public class Bed implements Priceable {

    private static final int PRICE_FOR_METER_EUROS = 30; // euros

    private double widthMeters; // in meters

    public Bed(double widthMeters) {
        this.widthMeters = widthMeters;
    }

    public double getWidthMeters() {
        return widthMeters;
    }

    public void setWidthMeters(double widthMeters) {
        this.widthMeters = widthMeters;
    }

    @Override
    public double getPrice() {
        return PRICE_FOR_METER_EUROS * widthMeters;
    }
}
