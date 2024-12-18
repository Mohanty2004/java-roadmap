package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon(
                "D:\\my codes\\Java\\java-roadmap\\GUI\\vecteezy_golden-logo-template_23654784.png");
        frame.getContentPane().setBackground(new Color(123, 50, 251));
        frame.setIconImage(image.getImage());

        MyFrame myframe = new MyFrame();
    }
}
