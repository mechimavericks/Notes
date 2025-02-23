import java.awt.*;
import java.awt.event.*;
public class Counter{
        static int count=0;
    public static void main(String args[]){
        Frame f = new Frame("Click Counter");
        Label l=new Label("     "+count+"   ");
        Button btn = new Button("Click");
        f.add(l);
        f.add(btn);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);  
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                count++;
                l.setText("     "+count+"   ");
        }
        });
    }
}