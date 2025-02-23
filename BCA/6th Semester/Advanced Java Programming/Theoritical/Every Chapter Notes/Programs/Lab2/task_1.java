/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab2;

/**
 *
 * @author Administrator
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class task_1 implements ActionListener{
    JButton btnRed, btnBlue, btnGreen;
    JPanel panel;
    JFrame frame;
    public void create(){
        btnRed = new JButton("Red Color");
        btnRed.setToolTipText("Red Color");
        btnRed.setBounds(10, 30, 100, 30);
        btnRed.addActionListener(this);
        btnBlue = new JButton("Blue Color");
        btnBlue.setToolTipText("Blue Color");
        btnBlue.setBounds(120, 30, 100, 30);
        btnBlue.addActionListener(this);
        btnGreen = new JButton("Green Color");
        btnGreen.setToolTipText("Green Color");
        btnGreen.setBounds(230, 30, 100, 30);
        btnGreen.addActionListener(this);
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(btnRed);
        panel.add(btnBlue);
        panel.add(btnGreen);
        frame = new JFrame("Button in action");
        frame.add(panel);
        frame.setSize(350, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnRed)){
            panel.setBackground(Color.RED);
        }
        if(e.getSource().equals(btnBlue)){
            panel.setBackground(Color.BLUE);
        }
        if(e.getSource().equals(btnGreen)){
            panel.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args){
        task_1 t1 = new task_1();
        t1.create();
    }
}
