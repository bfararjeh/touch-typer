package components.GUI;

import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

/*
 * class that generates a GUI for project
 */
public final class GUIMain {
    
    public GUIMain() throws IOException{
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 5));



        frame.add(panel, BorderLayout.CENTER);
        
        Image icon = ImageIO.read(ClassLoader.getSystemResource("icon.png"));
        frame.setIconImage(icon);   
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Touch Type Trainer");
        
        frame.setMinimumSize(new Dimension(1000, 750));
        frame.setResizable(false);
        frame.setVisible(true);  
        frame.pack();
    }
}
