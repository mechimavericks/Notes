/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab5;

/**
 *
 * @author Administrator
 */
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Task implements ActionListener {

    JLabel lblName, lblAddress, lblContact, lblFaculty, lblLevel, lblEmail;
    JTextField txtName, txtAddress, txtContact, txtEmail;
    JComboBox<String> cmbFaculty;
    JComboBox<String> cmbLevel;
    JButton btnSubmit;
    JPanel panel;
    JFrame frame;

    public void form() {
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
        txtContact.setBounds(175, 120, 200, 25);
        txtEmail = new JTextField();
        txtEmail.setBounds(175, 240, 200, 25);

        String faculty[] = {"", "Humanities", "Education", "Science", "Management"};
        cmbFaculty = new JComboBox(faculty);
        cmbFaculty.setBounds(175, 160, 200, 25);
        String level[] = {"", "Bachelor", "Masters"};
        cmbLevel = new JComboBox(level);
        cmbLevel.setBounds(175, 200, 200, 25);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(200, 300, 100, 25);
        btnSubmit.addActionListener(this);

        panel = new JPanel();
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

        frame = new JFrame("Register Form");
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnSubmit)) {
            String name = txtName.getText();
            String address = txtAddress.getText();
            String contact = txtContact.getText();
            String faculty = cmbFaculty.getSelectedItem().toString();
            String level = cmbLevel.getSelectedItem().toString();
            String email = txtEmail.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String DB_URL = "jdbc:sqlserver://RAHULAGRAWAL:1433;databaseName=BCA;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
                Connection con = DriverManager.getConnection(DB_URL);
                System.out.println("Database connected...");
                Statement statement = con.createStatement();
                String sql = "INSERT INTO Student (Name, Address, Contact, Faculty, Level, Email) VALUES('" + name + "','" + address + "','" + contact + "','" + faculty + "','" + level + "','" + email + "')";
                statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data inserted "
                        + "successfully");
                frame.setVisible(false);
                String sql1 = "SELECT * FRom Student";
                ResultSet rs = statement.executeQuery(sql1);
                System.out.println("Name\tAddress\tContact\t"
                        + "Faculty\tLevel\tEmail");
                while(rs.next()){
                    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Task obj = new Task();
        obj.form();
    }
}
