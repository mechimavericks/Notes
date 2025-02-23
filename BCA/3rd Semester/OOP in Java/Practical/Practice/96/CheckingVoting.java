import javax.swing.*;
import java.awt.event.*;
class CheckingVoting{
    public static void main(String args[]){
        JFrame f=new JFrame("Checking for Voting");
        f.setSize(400,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1=new JLabel("Enter Your Age: ");
        lbl1.setBounds(20,20,100,30);
        f.add(lbl1);
        JTextField txt = new JTextField();
        txt.setBounds(130,20,180,30);
        f.add(txt);
        JButton btn = new JButton("Check");
        btn.setBounds(75,70,150,30);
        f.add(btn);
        JLabel lbl2 = new JLabel();
        lbl2.setBounds(40,120,200,30);
        f.add(lbl2);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int age = Integer.parseInt(txt.getText().toString());
                if(age>=18){
                    lbl2.setText("You are Eligible to Vote...");
                }else{
                    lbl2.setText("You are not Eligible to Vote...");
                }
            }
        });
    }
}