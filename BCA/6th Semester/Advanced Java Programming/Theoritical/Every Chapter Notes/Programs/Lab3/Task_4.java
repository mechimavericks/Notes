/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab3;

/**
 *
 * @author Administrator
 */
import java.awt.event.*;
import javax.swing.*;

public class Task_4 extends JFrame {
    private JLabel keyLabel;

    public Task_4() {
        keyLabel = new JLabel("Pressed Key: ");
        add(keyLabel);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String keyText = KeyEvent.getKeyText(e.getKeyCode());
                keyLabel.setText("Pressed Key: " + keyText);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Key Adapter Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task_4();
    }
}

