package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttons extends JFrame {
    JButton button; // Instance variable

    Buttons() {
        // Initialize the instance variable
        button = new JButton("Click here");
        button.setFocusable(false);
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("poo")); // Lambda for action listener

        // Frame setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        // Add button to the frame
        this.add(button);
    }

    public static void main(String[] args) {
        new Buttons(); // Create and display the frame
    }
}
