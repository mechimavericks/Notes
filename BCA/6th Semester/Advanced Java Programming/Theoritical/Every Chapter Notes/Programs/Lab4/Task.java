/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adv_java.Lab4;

/**
 *
 * @author Administrator
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.*;

public class Task implements ActionListener {

    public JButton insertButton, delButton, updateButton, displayButton;
    JLabel lblName, lblAddress, lblContact, lblFaculty, lblLevel, lblEmail;
    JTextField txtName, txtAddress, txtContact, txtEmail;
    JComboBox<String> cmbFaculty;
    JComboBox<String> cmbLevel;
    JButton btnSubmit, btnBack;
    JFrame frame;
    JPanel panel;
    String[] columnNames = {"Name", "Address", "Contact", "Faculty", "Level", "Email"};

    public void form() {
        insertButton = new JButton("Insert Data");
        insertButton.setBounds(40, 20, 200, 25);
        insertButton.addActionListener(this);
        delButton = new JButton("Delete Data");
        delButton.setBounds(40, 60, 200, 25);
        delButton.addActionListener(this);
        updateButton = new JButton("Update Data");
        updateButton.setBounds(40, 100, 200, 25);
        updateButton.addActionListener(this);
        displayButton = new JButton("Display Data");
        displayButton.setBounds(40, 140, 200, 25);
        displayButton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(insertButton);
        panel.add(delButton);
        panel.add(updateButton);
        panel.add(displayButton);

        frame = new JFrame("Choices");
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insertButton)) {
            frame.setVisible(false);
            form1();
        }
        if (e.getSource().equals(delButton)) {
            frame.setVisible(false);
            boolean deleteMore = true;
            while (deleteMore) {
                String input = JOptionPane.showInputDialog(null, "Enter the name of the student");
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String DB_URL = "jdbc:sqlserver://RAHULAGRAWAL:1433;databaseName=BCA;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
                    Connection con = DriverManager.getConnection(DB_URL);
                    System.out.println("Database connected...");

                    // Check if data exists before deleting
                    String selectSql = "SELECT COUNT(*) FROM CollegeStudent WHERE Name = ?";
                    PreparedStatement selectStatement = con.prepareStatement(selectSql);
                    selectStatement.setString(1, input);
                    ResultSet resultSet = selectStatement.executeQuery();
                    resultSet.next();
                    int count = resultSet.getInt(1);
                    if (count > 0) {
                        // Data exists, prompt for confirmation
                        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data for the student?");
                        if (confirm == JOptionPane.YES_OPTION) {
                            // User confirmed, proceed with deletion
                            String deleteSql = "DELETE FROM CollegeStudent WHERE Name = ?";
                            PreparedStatement deleteStatement = con.prepareStatement(deleteSql);
                            deleteStatement.setString(1, input);
                            int rowsAffected = deleteStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data deleted successfully");
                            } else {
                                JOptionPane.showMessageDialog(null, "Data deletion failed");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No data found for the specified name");
                    }

                    con.close();

                    // Prompt for deleting more data
                    int deleteMoreChoice = JOptionPane.showConfirmDialog(null, "Do you want to delete more data?");
                    if (deleteMoreChoice == JOptionPane.YES_OPTION) {
                        deleteMore = true;
                    } else {
                        deleteMore = false;
                        form(); // Call the form() function or perform other actions
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        }
        if (e.getSource().equals(displayButton)) {
            frame.setVisible(false);
            form2();
        }
        if (e.getSource().equals(btnBack)) {
            frame.setVisible(false);
            form();
        }
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
                String sql = "INSERT INTO CollegeStudent (Name, Address, Contact, Faculty, lvl, Email) VALUES('" + name + "','" + address + "','" + contact + "','" + faculty + "','" + level + "','" + email + "')";
                statement.executeUpdate(sql);
                int option = JOptionPane.showOptionDialog(
                        null,
                        "Data inserted successfully. Want to insert more?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Yes", "No"},
                        "Yes"
                );
                if (option == JOptionPane.YES_OPTION) {
                    txtName.setText("");
                    txtAddress.setText("");
                    txtContact.setText("");
                    cmbFaculty.setSelectedIndex(0);
                    cmbLevel.setSelectedIndex(0);
                    txtEmail.setText("");
                } else {
                    frame.setVisible(false);
                    form();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void form1() {
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

    public void form2() {
        btnBack = new JButton("Back");
        btnBack.setBounds(200, 350, 100, 25);
        btnBack.addActionListener(this);
        frame = new JFrame("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        JTable table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String name = "";
        String address = "";
        String contact = "";
        String faculty = "";
        String level = "";
        String email = "";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String DB_URL = "jdbc:sqlserver://RAHULAGRAWAL:1433;databaseName=BCA;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(DB_URL);
            System.out.println("Database connected...");
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM CollegeStudent";
            ResultSet rs = statement.executeQuery(sql);
            int i = 0;
            if (rs.next()) {
                name = rs.getString("Name");
                address = rs.getString("Address");
                contact = rs.getString("Contact");
                faculty = rs.getString("Faculty");
                level = rs.getString("lvl");
                email = rs.getString("Email");
                model.addRow(new Object[]{name, address, contact, faculty, level, email});
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        frame.add(btnBack);
        frame.add(scroll);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Task tsk = new Task();
        tsk.form();
    }
}
