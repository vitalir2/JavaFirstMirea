package ru.mirea.task8.first;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final short WIDTH = 500;
    private static final short HEIGHT = 500;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new ShapesPanel(WIDTH, HEIGHT));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
