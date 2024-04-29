package components.GUI;

import javax.swing.*;
import java.io.IOException;

/*
 * class that generates a GUI for project
 */
public final class GUIMain {
    
    public GUIMain() throws IOException{

        SwingUtilities.invokeLater(new Runnable(){

            public void run() {
                new Frame();
            }

        });

        // Image icon = ImageIO.read(ClassLoader.getSystemResource("icon.png"));
        // frame.setIconImage(icon);
        
        // JPanel panel = new JPanel();
        // panel.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        // frame.add(panel, BorderLayout.CENTER);

    }
}
