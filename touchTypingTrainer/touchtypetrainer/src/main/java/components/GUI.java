package components;

import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

/*
 * class that generates a GUI for project
 */
public class GUI {
    
    public GUI() throws IOException{
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        600, 400, 100, 600));
        panel.setLayout(new GridLayout(0, 1));
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Touch Type Trainer");

        Image icon = ImageIO.read(ClassLoader.getSystemResource("icon.png"));
        frame.setIconImage(icon);   
        
        frame.pack();
        frame.setVisible(true);  
        frame.setResizable(false);
    }
}
