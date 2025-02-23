/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab1;

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import java.awt.*;

class ImageExample extends JPanel {
    @Override
    public void paint(Graphics g){
        ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\Downloads\\java.jpg");
        Image img = icon.getImage();
        g.drawImage(img, 0, 0, this);
        g.drawImage(img, 250, 250, this);
        g.drawImage(img, 0,250, 150,100, this);
    }
}

public class Task_4{
    public static void main(String[] args){
        JFrame frame = new JFrame("Image Display");
        frame.add(new ImageExample());
        frame.setSize(520, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


