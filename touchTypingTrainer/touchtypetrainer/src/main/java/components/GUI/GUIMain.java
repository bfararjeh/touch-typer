package components.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Image;

/*
 * class that generates a GUI for project.
 */
public final class GUIMain {

    private Frame frame;
    
    public GUIMain(){

        SwingUtilities.invokeLater(new Runnable(){
            // functino that builds the frame. it also:
            //  locates the icon image
            public void run() {
                frame = new Frame();

                Image icon;
                try {
                    icon = ImageIO.read(ClassLoader.getSystemResource(
                        "icon.png"));
                    frame.setIconImage(icon);
                
                } catch (Exception e) {
                    System.out.println("Caught an Exception!" 
                    + " 'icon.png' cannot be found");
                    e.printStackTrace();
                    }
                 }       
            });
        }
    }
