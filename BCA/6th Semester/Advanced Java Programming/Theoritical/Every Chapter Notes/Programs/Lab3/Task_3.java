/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab3;

/**
 *
 * @author Administrator
 */
//Java program to demonstrate the WindowListener with texts displaying on console on certain window events
import java.awt.*;
import java.awt.event.*;
//class that implements the WindowListener interface

public class Task_3 implements WindowListener {
//create a label

    Label lbl1;
//create frame
    Frame fr;

    Task_3() {
        fr = new Frame("Window events demo . . .");
        lbl1 = new Label(" Window events will be displayed on console", Label.CENTER);
//set the layout
        fr.setLayout(new FlowLayout());
//add the label to the frame
        fr.add(lbl1);
//In order to catch as well as respond to the mouse events, register the created class JWindowListenerExample
        fr.addWindowListener(this);
//set the size of frame where width is 350 and height as 250
        fr.setSize(350, 250);
        fr.setLocationRelativeTo(null);
//set the visibility as true
        fr.setVisible(true);
    }
//implementation of windowActivated method

    public void windowActivated(WindowEvent ev) {
        System.out.println("Window is activated now");
    }
//implementation of windowClosed method

    public void windowClosed(WindowEvent ev) {
        System.out.println("Now, the window is closed");
    }
//implementation of windowClosing method

    public void windowClosing(WindowEvent ev) {
//release all the resources
        fr.dispose();
        System.out.println("Window is closing now");
    }
//implementation of windowDeactivated method

    public void windowDeactivated(WindowEvent ev) {
        System.out.println("Window gets Deactivated");
    }
//implementation of windowDeiconified method

    public void windowDeiconified(WindowEvent ev) {
        System.out.println("Window gets Deiconified");
    }
//implementation of windowIconified method

    public void windowIconified(WindowEvent ev) {
        System.out.println("Window gets minimized or iconified");
    }
//implementation of windowOpened method

    public void windowOpened(WindowEvent e) {
        System.out.println("The window is opening for the very first time");
    }
//main method

    public static void main(String... ar) {
        new Task_3();
    }
}
