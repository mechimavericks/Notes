/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab2;

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class task_2 implements ActionListener{
 JLabel lblname, lblpassword, lblgender,lblcountry, lbllevel, lblpackage;
 JTextField txtname;
 JPasswordField txtpassword;
 JCheckBox chkmale, chkfemale;
 JComboBox<String> cmb;
 JList list;
 JRadioButton rdo1, rdo2;
 JButton btnsubmit, btnback;
 JFrame frame;
 JPanel panel;
 public void createForm(){
    lblname=new JLabel("Name:");
    lblpassword=new JLabel("Password:");
    lblgender=new JLabel("Gender:");
    lblcountry=new JLabel("Select Country:");
    lbllevel=new JLabel("Select Level:");
    lblpackage=new JLabel("Select Package:");
    
    txtname=new JTextField();
    txtpassword=new JPasswordField();
    chkmale=new JCheckBox("Male");
    chkfemale=new JCheckBox("Female");
    String country[]={"Nepal","india","China","Bangladesh","Afghanistan","Sri Lanka","Bhutan","Pakistan","Maldives"};
    cmb=new JComboBox(country);
    String level[]={"SLC","Intermediate","Bachelor","Master's"};
    JScrollPane scrollpane=new JScrollPane();
 
    list=new JList(level);
    scrollpane.setViewportView(list);

    rdo1=new JRadioButton("Standard");
    rdo2=new JRadioButton("Premium");

    btnsubmit=new JButton("Submit");
    btnsubmit.setToolTipText("Adds Record");

    lblname.setBounds(50, 40, 200, 25);
    lblpassword.setBounds(50, 80, 200, 25);
    lblcountry.setBounds(50, 120, 200, 25);
    lblgender.setBounds(50, 160, 200, 25);
    lbllevel.setBounds(50, 200, 200, 25);
    lblpackage.setBounds(50, 300, 200, 25);

    txtname.setBounds(250, 40, 200, 25);
    txtpassword.setBounds(250, 80, 200, 25);
    cmb.setBounds(250, 120, 200, 25);
    chkmale.setBounds(250, 160, 100, 25);
    chkfemale.setBounds(350, 160, 100, 25);
    scrollpane.setBounds(250, 200, 200, 50);
    rdo1.setBounds(250, 300, 100, 25);
    rdo2.setBounds(350, 300, 100, 25);
    btnsubmit.setBounds(200, 380, 100, 30);
    btnsubmit.addActionListener(this);

    panel=new JPanel();
    panel.setLayout(null);
    panel.add(lblname);
    panel.add(lblpassword);
    panel.add(lblcountry);
    panel.add(lblgender);
    panel.add(lbllevel);
    panel.add(lblpackage);
    panel.add(txtname);
    panel.add(txtpassword);
    panel.add(cmb);
    panel.add(chkmale);
    panel.add(chkfemale);
    panel.add(scrollpane);
    panel.add(rdo1);
    panel.add(rdo2);
    panel.add(btnsubmit);
    frame=new JFrame("Register Form");
    frame.add(panel);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
} 
public void Display(String name, String password, String 
        country, String gender, String level, String pack){
    JLabel lname = new JLabel(name);
    JLabel lpassword = new JLabel(password);
    JLabel lcountry = new JLabel(country);
    JLabel lgender = new JLabel(gender);
    JLabel llevel = new JLabel(level);
    JLabel lpack = new JLabel(pack);
    
    lblname=new JLabel("Name:");
    lblpassword=new JLabel("Password:");
    lblgender=new JLabel("Gender:");
    lblcountry=new JLabel("Country:");
    lbllevel=new JLabel("Level:");
    lblpackage=new JLabel("Package:");
    btnback = new JButton("Back");
    
    lblname.setBounds(50, 40, 200, 25);
    lblpassword.setBounds(50, 80, 200, 25);
    lblcountry.setBounds(50, 120, 200, 25);
    lblgender.setBounds(50, 160, 200, 25);
    lbllevel.setBounds(50, 200, 200, 25);
    lblpackage.setBounds(50, 240, 200, 25);
    
    lname.setBounds(260, 40, 200, 25);
    lpassword.setBounds(260, 80, 200, 25);
    lcountry.setBounds(260, 120, 200, 25);
    lgender.setBounds(260, 160, 200, 25);
    llevel.setBounds(260, 200, 200, 25);
    lpack.setBounds(260, 240, 200, 25);
    btnback.setBounds(200, 380, 100, 30);
    btnback.addActionListener(this);
    
    panel = new JPanel();
    panel.setLayout(null);
    panel.add(lblname);
    panel.add(lblpassword);
    panel.add(lblcountry);
    panel.add(lblgender);
    panel.add(lbllevel);
    panel.add(lblpackage);
    panel.add(lname);
    panel.add(lpassword);
    panel.add(lcountry);
    panel.add(lgender);
    panel.add(llevel);
    panel.add(lpack);
    panel.add(btnback);
    frame=new JFrame("Student Data");
    frame.add(panel);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 @Override
 public void actionPerformed(ActionEvent e){
    if (e.getSource().equals(btnsubmit)){
        String name = txtname.getText();
        String password = String.valueOf(txtpassword.getPassword());
        String country = cmb.getSelectedItem().toString();
        String gender;
        if (chkmale.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }
        String level = list.getSelectedValue().toString();
        String pack;
        if(rdo1.isSelected())
            pack = "Standard";
        else
            pack = "Premium";
        frame.setVisible(false);
        Display(name, password, country, gender, level, pack);
    }
    if(e.getSource().equals(btnback)){
        frame.setVisible(false);
        createForm();
    }
}
    public static void main(String args[]){
        task_2 fm=new task_2();
        fm.createForm();
    }
}
