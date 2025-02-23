/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab2;

/**
 *
 * @author Administrator
 */
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class task_3 implements ActionListener{
    JLabel lblName, lblAddress, lblContact, lblFaculty, 
            lblLevel, lblEmail;
    JTextField txtName, txtAddress, txtContact, txtEmail;
    JComboBox<String> cmbFaculty; 
    JComboBox<String> cmbLevel;
    JButton btnSubmit;
    JPanel panel;
    JFrame frame;
    ArrayList<Student> st = new ArrayList<Student>();
    public void form(){
        lblName = new JLabel("Name:");
        lblName.setBounds(50, 40, 100, 25);
        lblAddress = new JLabel("Address:");
        lblAddress.setBounds(50, 80, 100, 25);
        lblContact = new JLabel("Contact:");
        lblContact.setBounds(50, 120, 100, 25);
        lblFaculty = new JLabel("Faculty:");
        lblFaculty.setBounds(50, 160, 100, 25);
        lblLevel = new JLabel("Level:");
        lblLevel.setBounds(50, 200, 100, 25);
        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 240, 100, 25);
        
        txtName = new JTextField();
        txtName.setBounds(175, 40, 200, 25);
        txtAddress = new JTextField();
        txtAddress.setBounds(175, 80, 200, 25);
        txtContact = new JTextField();
        txtContact.setBounds(175,120,200,25);
        txtEmail = new JTextField();
        txtEmail.setBounds(175,240,200,25);
        
        String faculty[] = {"","Humanities","Education", "Science", "Management"};
        cmbFaculty = new JComboBox(faculty);
        cmbFaculty.setBounds(175, 160, 200, 25);
        String level[] = {"", "Bachelor", "Masters"};
        cmbLevel = new JComboBox(level);
        cmbLevel.setBounds(175,200,200,25);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(200,300,100,25);
        btnSubmit.addActionListener(this);
        
        panel= new JPanel();
        panel.setLayout(null);
        panel.add(lblName);
        panel.add(lblAddress);
        panel.add(lblContact);
        panel.add(lblFaculty);
        panel.add(lblLevel);
        panel.add(lblEmail);
        panel.add(txtName);
        panel.add(txtAddress);
        panel.add(txtContact);
        panel.add(cmbFaculty);
        panel.add(cmbLevel);
        panel.add(txtEmail);
        panel.add(btnSubmit);
        
        frame=new JFrame("Register Form");
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnSubmit)){
            String name = txtName.getText();
            String address = txtAddress.getText();
            String contact = txtContact.getText();
            String faculty = cmbFaculty.getSelectedItem().toString();
            String level = cmbLevel.getSelectedItem().toString();
            String email = txtEmail.getText();
            
            Student student = new Student(name, address, contact, faculty, level, email);
            st.add(student);
            frame.setVisible(false);
            form();
            if(st.size()==3){
                System.out.print("""
                                 Name\tAddress\tContact\tFaculty\tLevel\tEmail
                                 """);
                for(Student st1:st){
                    System.out.println(st1.name + "\t" + st1.address + "\t" + st1.contact + "\t" + st1.faculty + "\t"+st1.level + "\t" + st1.email);
                }
            }
        }
        
    }
    public static void main(String[] args){
        task_3 obj = new task_3();
        obj.form();
    }
    class Student {
        public String name;
        public String address;
        public String contact;
        public String faculty;
        public String level;
        public String email;

        public Student(String name, String address, String contact, String faculty, String level, String email) {
            this.name = name;
            this.address = address;
            this.contact = contact;
            this.faculty = faculty;
            this.level = level;
            this.email = email;
        }
    }
}
