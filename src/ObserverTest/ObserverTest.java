package ObserverTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by ITHILLEL6 on 31.07.2015.
 */
public class ObserverTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Observer TEST!");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ActionListener Listener = new MyButtonListener();



        JButton button = new JButton("Click!");
        frame.getContentPane().add(button);
        button.addActionListener(Listener);

        ActionListener textChanger = new TextChanger(button);
        button.addActionListener(textChanger);
        frame.getContentPane().add(button);

        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
