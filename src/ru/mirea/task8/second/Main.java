package ru.mirea.task8.second;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    static BufferedImage image;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            image = ImageIO.read(new File(args[0]));
        } catch (IOException exception) {
            System.out.println("Bad file");
        }

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(image.getWidth(), image.getHeight());
            }
        };
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
