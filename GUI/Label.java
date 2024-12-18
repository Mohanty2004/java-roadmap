package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {

    public static void main(String[] args) {
        ImageIcon image = new ImageIcon();
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        JLabel label = new JLabel();
        label.setText("Bro! Do you even code?");
        label.setIcon(image);
        label.setForeground(new Color(0x00FF30)); // Set text color (green)
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set text font
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Center the text within the label
        label.setHorizontalAlignment(JLabel.CENTER); // Center horizontally
        label.setVerticalAlignment(JLabel.CENTER); // Center vertically
        // label.setBounds(100, 100, 250, 250);

        // Create and configure the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);// set the frame size
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); // Add the label to the frame
        frame.pack();

    }
}
