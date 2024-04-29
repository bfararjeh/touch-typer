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
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 20));
        // panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));

        // panel.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);



        
        Image icon = ImageIO.read(ClassLoader.getSystemResource("icon.png"));
        frame.setIconImage(icon);   

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Touch Type Trainer");

        frame.setVisible(true);  
        // frame.setResizable(false);
        frame.pack();
    }
}
