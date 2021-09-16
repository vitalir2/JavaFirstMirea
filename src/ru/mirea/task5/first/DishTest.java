package ru.mirea.task5.first;

public class DishTest {
    public static void main(String[] args) {
        Bowl bowl = new Bowl("My mother's ceramic bowl", "ceramic");
        BeerGlass beerGlass = new BeerGlass("Lovely beer glass", "glass");

        bowl.cookIn();
        beerGlass.eatIn();
        bowl.setMaterial("wood");
        System.out.println(bowl);
    }
}
