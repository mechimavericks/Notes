/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab3;

/**
 *
 * @author Administrator
 */

import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
public class Task_1 {
 
    public static void main(String args[]) {
        JFrame frame = new JFrame("Key Listener");
        Container contentPane = frame.getContentPane();
        KeyListener listener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                printEventInfo("Key Pressed", event);
            }
            @Override
            public void keyReleased(KeyEvent event) {
                printEventInfo("Key Released", event);
            }
            @Override
            public void keyTyped(KeyEvent event) {
                printEventInfo("Key Typed", event);
            }
            private void printEventInfo(String str, KeyEvent e) {
                System.out.println(str);
                int code = e.getKeyCode();
                System.out.println("   Code: " + KeyEvent.getKeyText(code));
                System.out.println("   Char: " + e.getKeyChar());
                int mods = e.getModifiersEx();
                System.out.println("    Mods: "
                        + KeyEvent.getModifiersExText(mods));
                System.out.println("    Location: "
                        + keyboardLocation(e.getKeyLocation()));
                System.out.println("    Action? " + e.isActionKey());
            }
            private String keyboardLocation(int keybrd) {
                switch (keybrd) {
                    case KeyEvent.KEY_LOCATION_RIGHT:
                        return "Right";
                    case KeyEvent.KEY_LOCATION_LEFT:
                        return "Left";
                    case KeyEvent.KEY_LOCATION_NUMPAD:
                        return "NumPad";
                    case KeyEvent.KEY_LOCATION_STANDARD:
                        return "Standard";
                    case KeyEvent.KEY_LOCATION_UNKNOWN:
                    default:
                        return "Unknown";
                }
            }
        };
        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 100, 25);
        textField.addKeyListener(listener);
        contentPane.add(textField, BorderLayout.NORTH);
        frame.pack();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
