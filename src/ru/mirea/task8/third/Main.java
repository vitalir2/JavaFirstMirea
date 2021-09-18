package ru.mirea.task8.third;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        AnimationGifApplet animationGifApplet = new AnimationGifApplet();
        JFrame frame = new JFrame("Animation");
        frame.add(animationGifApplet, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
