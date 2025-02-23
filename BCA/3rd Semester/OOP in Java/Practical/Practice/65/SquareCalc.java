import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SquareCalc{
    public static void main(String args[]){
        JFrame f = new JFrame("Square Calculator");
        f.setSize(400,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1=new JLabel("Enter any Number: ");
        lbl1.setBounds(15,10,150,20);
        f.add(lbl1);
        JTextField txt1 = new JTextField();
        txt1.setBounds(200,10,100,30);
        f.add(txt1);
        JButton btn = new JButton("Calculate Square");
        btn.setBounds(50,50,150,30);
        f.add(btn);
        JLabel lbl2=new JLabel("square of entered number:");
        lbl2.setBounds(15,90,160,20);
        f.add(lbl2);
        JTextField txt2 = new JTextField();
        txt2.setBounds(200,90,100,30);
        f.add(txt2);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(txt1.getText().toString());
                a*=a;
                txt2.setText(""+a);
            }
        });
    }
}