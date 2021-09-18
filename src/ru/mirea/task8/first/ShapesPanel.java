package ru.mirea.task8.first;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapesPanel extends JPanel {
    private static final byte NUMBER_OF_SHAPES = 20;
    private static final short MAX_COLOR = 255;
    private static final byte FIGURE_SIZE = 50;

    private final List<Object> shapes = new ArrayList<>();
    private final Random random = new Random();
    private final short maxX;
    private final short maxY;

    public ShapesPanel(short maxX, short maxY) {
        this.maxX = maxX;
        this.maxY = maxY;

        for (int i = 0; i < NUMBER_OF_SHAPES; ++i) {
            if (i % 2 == 0) {
                addSquare();
            } else {
                addCircle();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object obj: shapes) {
            if (obj instanceof Square) {
                ((Square) obj).draw(g);
            } else if (obj instanceof Circle) {
                ((Circle) obj).draw(g);
            }
        }
    }

    private void addSquare() {
        Color randomColor = new Color(random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR));
        shapes.add(new Square(
                random.nextInt(maxX - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                random.nextInt(maxY - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                randomColor,
                FIGURE_SIZE));
    }

    private void addCircle() {
        Color randomColor = new Color(random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR), random.nextInt(MAX_COLOR));
        shapes.add(new Circle(
                random.nextInt(maxX - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                random.nextInt(maxY - 2 * FIGURE_SIZE) + FIGURE_SIZE,
                randomColor,
                FIGURE_SIZE));
    }
}
