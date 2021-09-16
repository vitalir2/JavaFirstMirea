package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;

public class SportGame {
    private static final int SCREEN_HEIGHT = 300;
    private static final int SCREEN_WIDTH = 400;
    private static final int BUTTON_HEIGHT = 25;
    private static final int BUTTON_WIDTH = SCREEN_WIDTH / 3;
    private static final int FINAL_SCORE = 10;
    private static int milanScore = 0;
    private static int madridScore = 0;
    private static boolean isOver = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sport game");

        JLabel label1 = new JLabel("Result: 0 X 0");
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel("Last Scorer: N/A");
        label2.setHorizontalAlignment(JLabel.CENTER);

        Label text = new Label("Winner: DRAW");
        text.setAlignment(Label.CENTER);

        JButton button1 = new JButton("AC Milan");
        button1.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button1.setLocation(0, SCREEN_HEIGHT / 2 - BUTTON_HEIGHT);
        button1.addActionListener(actionEvent -> changeGameState(button1, label1, label2, text, true));

        JButton button2 = new JButton("Read Madrid");
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        button2.setLocation(SCREEN_WIDTH - BUTTON_WIDTH, SCREEN_HEIGHT / 2 - BUTTON_HEIGHT);
        button2.addActionListener(actionEvent -> changeGameState(button2, label1, label2, text, false));

        frame.add(button1);
        frame.add(button2);
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.SOUTH);
        frame.add(text, BorderLayout.CENTER);

        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setVisible(true);
    }

    private static void changeGameState(JButton button, JLabel label1, JLabel label2, Label text, boolean increaseMilan) {
            if (!isOver) {
                if (increaseMilan) {
                    ++milanScore;
                    if (milanScore >= FINAL_SCORE) {
                        text.setText("Winner: " + button.getText());
                        isOver = true;
                    }
                } else {
                    ++madridScore;
                    if (madridScore >= FINAL_SCORE) {
                        text.setText("Winner: " + button.getText());
                        isOver = true;
                    }
                }
                label1.setText("Result: " + milanScore + " X " + madridScore);
                label2.setText("Last Scorer: " + button.getText());
            }
    }
}
