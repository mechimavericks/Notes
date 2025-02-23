import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SumUsingSwing{
    static JTextField t1,t2,t3,t4,t5,t6;
    public static void main(String args[]){
        JFrame f= new JFrame("Calculation");
        t1=new JTextField();
        t1.setBounds(150,50,200,30);
        t2=new JTextField();
        t2.setBounds(150,100,200,30);
        t3=new JTextField();
        t3.setBounds(150,200,100,30);
        t4=new JTextField();
        t4.setBounds(150,250,100,30);
        t5=new JTextField();
        t5.setBounds(150,300,100,30);
        t6=new JTextField();
        t6.setBounds(150,350,100,30);
        // t3=new JTextField();
        // t3.setBounds(150,200,100,30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        JLabel n1,n2,n3,n4,n5,n6;
        n1=new JLabel("First Number");
        n1.setBounds(50,50,100,30);
        n2=new JLabel("Second Number");
        n2.setBounds(50,100,100,30);
        n3=new JLabel("Addition");
        n3.setBounds(50,200,100,30);
        n4=new JLabel("Subtraction");
        n4.setBounds(50,250,100,30);
        n5=new JLabel("Multiplication");
        n5.setBounds(50,300,100,30);
        n6=new JLabel("Division");
        n6.setBounds(50,350,100,30);
        f.add(n1);
        f.add(n2);
        f.add(n3);
        f.add(n4);
        f.add(n5);
        f.add(n6);
        JButton btn=new JButton("Calculate");
        btn.setBounds(150,150,95,30);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t3.setText(Integer.toString(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
                t4.setText(Integer.toString(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
                t5.setText(Integer.toString(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
                t6.setText(Integer.toString(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
            }
        });
        f.add(btn);
        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);
    }
}