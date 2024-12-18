package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
      
        // this.setResizable(false);
        this.setSize(420, 420);
        this.setTitle("Jthis title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon image = new ImageIcon();
        this.getContentPane().setBackground(new Color(123, 50, 251));
        this.setIconImage(image.getImage());
    }

    }

}
