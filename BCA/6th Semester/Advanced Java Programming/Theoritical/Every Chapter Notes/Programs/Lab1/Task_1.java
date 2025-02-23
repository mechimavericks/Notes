package Adv_java.Lab1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Task_1 extends JFrame implements ActionListener {
    private JButton chooseColorButton;
    private JPanel mainPanel;

    public Task_1() {
        // Create the components
        chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(this);
        mainPanel = new JPanel();
        mainPanel.add(chooseColorButton);

        // Set up the frame
        setTitle("Color Chooser Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the button click
        if (e.getSource() == chooseColorButton) {
            Color color = JColorChooser.showDialog(this, "Choose a color", mainPanel.getBackground());
            if (color != null) {
                mainPanel.setBackground(color);
            }
        }
    }

    public static void main(String[] args) {
        new Task_1();
    }
}
