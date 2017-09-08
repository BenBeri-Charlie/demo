/**
 * Created by charlie-richi on 21.07.17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.Thread.sleep;
import java.util.Timer;

public class Engine extends JComponent {
    static public boolean x = false;

    public void paint(Graphics gn) {

        gn.setColor(Color.DARK_GRAY);
        gn.fillRect(0, 0, 200, 440);
        gn.fillRect(Heart.x * 10 + 220, Heart.y * 10 + 20, 20, 20);
        System.out.println("перерисовка");
    }
}



