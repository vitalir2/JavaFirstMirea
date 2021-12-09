package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Start drawing rectangle with black border");
        rectangle.draw();
        System.out.println("Start drawing circle with red border");
        redCircle.draw();
        System.out.println("Start drawing rectangle with red border");
        redRectangle.draw();
    }
}
