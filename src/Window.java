/**
 * Created by charlie-richi on 15.07.17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Window {
     Window(){
        JFrame wind = new JFrame("Game");
        wind.setSize(640,440);
        wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wind.setLayout(new BorderLayout(1,1));
        wind.setResizable(false);
        wind.getContentPane().setBackground(Color.LIGHT_GRAY);
        Engine eg = new Engine();
        wind.add(eg);
        wind.setVisible(true);
        wind.addKeyListener(new KeyAdapter() {
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                if (Heart.cell[Heart.x-1][Heart.y]==0){
                    Heart.x=Heart.x-1;
                    Engine.x=true;
                    System.out.println(Heart.y);
                    //Engine.r();
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                if (Heart.cell[Heart.x+1][Heart.y]==0){
                    Heart.x=Heart.x+1;
                    Engine.x=true;
                    System.out.println(Heart.y);
                    Engine eg = new Engine();
                    wind.add(eg);
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_UP){
                if (Heart.cell[Heart.x][Heart.y-1]==0){
                    Heart.y=Heart.y-1;
                    Engine.x=true;
                    System.out.println(Heart.x);
                    Engine eg = new Engine();
                    wind.add(eg);
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                if (Heart.cell[Heart.x][Heart.y+1]==0){
                    Heart.y=Heart.y+1;
                    Engine.x=true;
                    System.out.println(Heart.x);
                    Engine eg = new Engine();
                    wind.add(eg);
                }
            }
            }
        });
     }


}


