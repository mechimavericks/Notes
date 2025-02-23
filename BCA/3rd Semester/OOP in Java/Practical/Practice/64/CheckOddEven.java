import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CheckOddEven{
    public static void main(String args[]){
        JFrame f=new JFrame("Checking for Voting");
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1 = new JLabel("Enter Your Age:");
        lbl1.setBounds(50,50,100,20);
        f.add(lbl1);
        JTextField txt = new JTextField();
        txt.setBounds(155,50,180,25);
        f.add(txt);
        JButton btn = new JButton("Check");
        btn.setBounds(100,100,150,30);
        f.add(btn);
        JLabel lbl2 = new JLabel();
        lbl2.setBounds(80,150,250,20);
        f.add(lbl2);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String check =txt.getText().toString();
                int age = Integer.parseInt(txt.getText().toString());
                    if(age>=18)
                    lbl2.setText("You are eligible for Vote...");
                    else
                    lbl2.setText("You are not eligible for Vote...");
            }
        });
    }
}