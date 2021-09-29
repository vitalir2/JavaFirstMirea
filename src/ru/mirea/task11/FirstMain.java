package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FirstMain {

    private static final int NUMBER_OF_TRIES = 3;

    private static boolean finished = false;
    private static int incorrectAnswers = 0;

    public static void main(String[] args) {
        Random random = new Random();
        int generatedRandomNumber = random.nextInt(20);

        JFrame frame = new JFrame("Make Prediction App");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel mainLabel = new JLabel("Попробуйте угадать число от 0 до 20");

        JTextField numberField = new JTextField();
        numberField.setPreferredSize(new Dimension(50, 25));

        JLabel guessingResultLabel = new JLabel("");
        guessingResultLabel.setPreferredSize(new Dimension(600, 25));

        JButton guessButton = new JButton("Угадать");
        guessButton.setPreferredSize(new Dimension(50, 25));
        guessButton.addActionListener(actionEvent -> {
            if (!finished) {
                int number = Integer.parseInt(numberField.getText());
                if (number == generatedRandomNumber) {
                    guessingResultLabel.setText("Поздравляем, вы угадали текст!");
                    finished = true;
                } else {
                    if (number > generatedRandomNumber) {
                        guessingResultLabel.setText("Ваше число оказалось неверным! Попробуйте число поменьше");
                    } else {
                        guessingResultLabel.setText("Ваше число оказалось неверным! Попробуйте число побольше");
                    }
                    ++incorrectAnswers;
                }
                if (incorrectAnswers >= NUMBER_OF_TRIES) {
                    guessingResultLabel.setText("Вы проиграли =(");
                    finished = true;
                }
            }
        });

        panel.add(mainLabel);
        panel.add(numberField);
        panel.add(guessingResultLabel);
        panel.add(guessButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
