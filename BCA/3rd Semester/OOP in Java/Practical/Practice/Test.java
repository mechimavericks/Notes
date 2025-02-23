import javax.swing.*;
import java.awt.event.*;
public class Test {
 public static void main(String args[]){
 JFrame jframe=new JFrame("This is a simple JFrame App");
 jframe.setSize(400, 300);
 jframe.setLocationRelativeTo(null);
 jframe.getContentPane().setLayout(null);
 jframe.setVisible(true);
 
 JLabel lbl1=new JLabel("First Number:");
 lbl1.setBounds(20, 10, 100, 10);
 jframe.add(lbl1);
 
 JTextField txt1=new JTextField();
 txt1.setBounds(120, 10, 120, 20);
 jframe.add(txt1);
 }
}