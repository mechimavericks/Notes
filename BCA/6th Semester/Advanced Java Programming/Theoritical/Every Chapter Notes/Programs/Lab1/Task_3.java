package Adv_java.Lab1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

class FontExample extends JPanel{
    public void paint(Graphics g){
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("This is Arial Font", 20, 30);

        g.setFont(new Font("Old English Text TMT", Font.BOLD, 14));
        g.drawString("Old English", 20, 60);

        g.setFont(new Font("Calibri", Font.BOLD, 16));
        g.drawString("This is Calibri Font", 20, 90);
    }
}




public class Task_3 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Different fonts");
        frame.add(new FontExample());
        frame.setSize(480, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
