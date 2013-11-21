package org.javase7.components;

/**
 *
 * @author Masudul Haque
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class JBall extends JFrame {

    JBallPanel news = new JBallPanel();

    public JBall() {

        super("JBall");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 220);
        JPanel pane = new JPanel();
        pane.setLayout(new GridLayout(1, 1, 15, 15));
        pane.add(news);
        setContentPane(pane);
        show();
        news.scroll();
    }

    public static void main(String arg[]) {
        JBall head = new JBall();
    }
}

class JBallPanel extends JPanel {

    String[] headlines = {"hello", "how are you?"};
    int y = 76;

    void scroll() {
        while (true) {
            y = y - 1;
            if (y < -7) {
                y = 76;
            }
            repaint();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp.setColor(getBackground());
        comp.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(Color.blue);
        for (int i = 0; i < headlines.length; i++) {
            comp2D.drawString(headlines[i], 5, y + (20 * i));
        }
    }
}
