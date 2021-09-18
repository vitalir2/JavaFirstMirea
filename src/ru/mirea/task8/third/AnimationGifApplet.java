package ru.mirea.task8.third;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class AnimationGifApplet extends Panel {
    private final Image[] img;
    private final int maxImg;
    private final MediaTracker tracker;
    private int index = 0;

    public AnimationGifApplet() {
        img = new Image[4];
        maxImg = img.length - 1;
        tracker = new MediaTracker(this);
        try {
            // images loading
            String basePath = new File("").getAbsolutePath() + "/src/ru/mirea/task8/third/";
            img[0] = ImageIO.read(new File(basePath + "kappa.jpeg"));
            img[1] = ImageIO.read(new File(basePath + "kappa90.jpg"));
            img[2] = ImageIO.read(new File(basePath + "kappa180.jpg"));
            img[3] = ImageIO.read(new File(basePath + "kappa270.jpg"));
            tracker.addImage(img[0], 0);
            tracker.addImage(img[1], 1);
            tracker.addImage(img[2], 2);
            tracker.addImage(img[3], 3);
            tracker.waitForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        AnimationThread at = new AnimationThread();
        at.delayedAnimation(this, 500);
        at.start();
    }

    public void paint(Graphics g) {
        if (img[0] != null) {
            g.drawImage(img[index], 0, 0, this);
            index = (index < maxImg) ? index + 1 : 0;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(img[0].getWidth(this), img[0].getHeight(this));
    }

    public void animate() {
        repaint();
    }

    static class AnimationThread extends Thread {
        AnimationGifApplet animationApplet;
        int delay;

        public void delayedAnimation(AnimationGifApplet a, int delay) {
            this.animationApplet = a;
            this.delay = delay;
        }

        public void run() {
            while (true) {
                try {
                    sleep(delay);
                    animationApplet.animate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
