import java.awt.event.*;
import javax.swing.*;
class GUISI{
    public static void main(String args[]){
        JFrame f=new JFrame("Simple Interest Calculator");
        f.setVisible(true);
        f.setSize(400,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Principle: ");
        l1.setBounds(10,10,100,30);
        f.add(l1);
        JTextField t1=new JTextField("0");
        t1.setBounds(120,10,180,30);
        f.add(t1);
        JLabel l2=new JLabel("Rate: ");
        l2.setBounds(10,50,100,30);
        f.add(l2);
        JTextField t2=new JTextField("0");
        t2.setBounds(120,50,180,30);
        f.add(t2);
         JLabel l3=new JLabel("Time: ");
        l3.setBounds(10,90,100,30);
        f.add(l3);
        JTextField t3=new JTextField("0");
        t3.setBounds(120,90,180,30);
        f.add(t3);
        JButton btn = new JButton("Calculate");
        btn.setBounds(80,140,140,40);
        f.add(btn);
        JLabel l4 = new JLabel("Interest = 0");
        l4.setBounds(20,180,150,30);
        f.add(l4);
        btn.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent ae){
                int p = Integer.parseInt(t1.getText().toString());
                int r = Integer.parseInt(t2.getText().toString());
                int t = Integer.parseInt(t3.getText().toString());
                int i= (p*t*r)/100;
                t1.setText("Interest = "+i);
            }
        });
    }
}
