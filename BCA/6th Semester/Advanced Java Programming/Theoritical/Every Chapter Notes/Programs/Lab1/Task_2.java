package Adv_java.Lab1;

import javax.swing.*;
import java.awt.*;

class Draw extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawLine(5,30, 380, 300);

        g.setColor(Color.GREEN);
        g.drawRect(5, 40, 90, 55);
        g.fillRect(5, 40, 90, 55);

        g.setColor(Color.BLUE);
        g.drawOval(195, 40, 90, 55);
        g.fillOval(195, 40, 90, 55);
    }
}
public class Task_2{
    public static void main(String[] args){
        JFrame frame = new JFrame("Sample Shapes...");
        frame.add(new Draw());
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
