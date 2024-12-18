package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {
    public static void main(String[] args) {
        // Load ImageIcon
        // ImageIcon icon = new ImageIcon(
        // "D:\\my
        // codes\\Java\\java-roadmap\\GUI\\vecteezy_golden-logo-template_23654784.png");

        // Create JLabel
        JLabel label = new JLabel();
        label.setText("Hi"); // Set text
        // label.setIcon(icon); // Set the image icon
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        // label.setHorizontalTextPosition(JLabel.CENTER); // Center text relative to
        // image
        // label.setVerticalTextPosition(JLabel.BOTTOM); // Text appears below the image
        label.setBounds(50, 50, 150, 150); // Set size and position of label (within the panel)

        // Red Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED); // Set red background
        redPanel.setBounds(0, 0, 250, 250); // Set position and size
        redPanel.setLayout(null); // Set null layout to position the label manually
        redPanel.add(label); // Add label to the red panel
        redPanel.setLayout(new BorderLayout());
        // Blue Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE); // Set blue background
        bluePanel.setBounds(250, 0, 250, 250); // Positioned next to red panel

        // Green Panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN); // Set green background
        greenPanel.setBounds(0, 250, 500, 250); // Positioned below red and blue panels
        greenPanel.setLayout(new BorderLayout());
        // JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Null layout for manual positioning
        frame.setSize(750, 750); // Set frame size
        frame.setVisible(true);
        redPanel.add(label);

        // Add Panels to Frame
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
