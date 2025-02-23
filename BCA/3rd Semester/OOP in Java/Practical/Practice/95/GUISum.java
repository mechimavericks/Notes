import java.awt.event.*;
import javax.swing.*;
class GUISum{
    public static void main(String args[]){
        JFrame f= new JFrame("SUM");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1=new JLabel("Num 1: ");
        lbl1.setBounds(10,10,80,30);
        f.add(lbl1);
        JTextField txt1=new JTextField();
        txt1.setBounds(100,10,150,30);
        f.add(txt1);    
        JLabel lbl2=new JLabel("Num 2: ");
        lbl2.setBounds(10,80,80,30);
        f.add(lbl2);
        JTextField txt2=new JTextField();
        txt2.setBounds(100,80,150,30);
        f.add(txt2);
        JButton btn = new JButton("SUM");
        btn.setBounds(100,150,130,30);
        f.add(btn);
        JLabel lbl3=new JLabel("Sum: ");
        lbl3.setBounds(10,200,100,30);
        f.add(lbl3);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1,n2;
                n1=Integer.parseInt(txt1.getText().toString());
                n2=Integer.parseInt(txt2.getText().toString());
                int sum=n1+n2;
                lbl3.setText("Sum = "+sum);
            }
        });

    }
}