// import javax.swing.*;
// // import java.awt.*;
// class Test{
//     public static void main(String args[]){
//         JFrame f = new JFrame("Test");
//         JPanel panel = new JPanel();
//         f.add(panel);
//         panel.setVisible(true);
//         panel.setSize(500,500);
//         JLabel lbl = new JLabel("Name: ");
//         panel.add(lbl);
//         JTextField txt = new JTextField();
//         txt.setBounds(30,12,150,10);
//         panel.add(txt);
//         f.setSize(550,550);
//         f.setVisible(true);
//     }
// }

import java.awt.*; 
import java.awt.event.*; 
public class Test extends Frame implements MouseListener
{ 
 Label l; 
 Test(){ 
 addMouseListener(this); 
 l=new Label(); 
 l.setBounds(20,50,100,20); 
 add(l); 
 setSize(300,300); 
 setLayout(null); 
 setVisible(true); 
 } 
 public void mouseClicked(MouseEvent e) { 
 l.setText("Mouse Clicked"); 
 } 
 public void mouseEntered(MouseEvent e) { 
 l.setText("Mouse Entered"); 
 } 
 public void mouseExited(MouseEvent e) { 
 l.setText("Mouse Exited"); 
 } 
 public void mousePressed(MouseEvent e) { 
 l.setText("Mouse Pressed"); 
 } 
 public void mouseReleased(MouseEvent e) { 
 l.setText("Mouse Released"); 
 } 
public static void main(String[] args) { 
 new Test(); 
} 
} 