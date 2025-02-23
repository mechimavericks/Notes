import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUISum{
    public static void main(String args[]){
        JFrame frame = new JFrame("Sum");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Number 1: ");
        l1.setBounds(10,10,100,30);
        frame.add(l1);
        JTextField t1=new JTextField("0");
        t1.setBounds(120,10,180,30);
        frame.add(t1);
        JLabel l2=new JLabel("Number 2: ");
        l2.setBounds(10,50,100,30);
        frame.add(l2);
        JTextField t2=new JTextField("0");
        t2.setBounds(120,50,180,30);
        frame.add(t2);
        JButton btn = new JButton("SUM");
        btn.setBounds(80,100,140,50);
        frame.add(btn);
        JLabel l3 = new JLabel("Sum = 0");
        l3.setBounds(20,180,150,30);
        frame.add(l3);
        btn.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent ae){
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c= a+b;
                l3.setText("Sum = "+c);
            }
        });
    }
}