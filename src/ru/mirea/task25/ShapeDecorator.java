package ru.mirea.task25;

// Not possible to make this interface (constructor??) as on the Decorator.jpg
public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
