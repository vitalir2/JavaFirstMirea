package ru.mirea.task6.second;

public class PriceableTest {
    public static void main(String[] args) {
        Bed bed = new Bed(3);
        Cellphone cellphone = new Cellphone(32);

        System.out.println(bed.getPrice());
        System.out.println(cellphone.getPrice());
    }
}
