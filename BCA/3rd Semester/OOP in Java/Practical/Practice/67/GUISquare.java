import java.awt.event.*;
import javax.swing.*;
class GUISquare{
    public static void main(String args[]){
        JFrame f=new JFrame("Square");
        f.setSize(300,200);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Number: ");
        l1.setBounds(10,10,60,30);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(80,10,150,30);
        f.add(t1);
        JButton btn = new JButton("Square");
         btn.setBounds(40,50,100,50);
        f.add(btn);
        JLabel l2=new JLabel("Square = ");
        l2.setBounds(30,110,100,30);
        f.add(l2);        
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int a = Integer.parseInt(t1.getText().toString());
                l2.setText("Square = "+(a*a));
            }
        });
    }
}