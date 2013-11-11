package org.javase7.components;

/**
 *
 * @author Masudul Haque
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {

    JButton button = new JButton("MouseEventTest");

    public Main() {
        super("MouseEventTest");
        setSize(400, 200);
        setDefaultCloseOperation(3);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
//        add(button);
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ID: " + e.getID());
//            }
//        });

        clickMouse(button, 50, 50);
    }

    private void clickMouse(Component c, int x, int y) {
        button.dispatchEvent(new MouseEvent(c, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, x, y, 1, false));
    }

    public static void main(String args[]) {
        new Main();
    }

}
