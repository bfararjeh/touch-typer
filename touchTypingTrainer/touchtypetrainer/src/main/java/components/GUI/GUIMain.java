package components.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * class that generates a GUI for project
 */
public final class GUIMain {

    private Frame frame;
    private static InputStream myStream = null;
    private static final String FONT_PATH_VERAMONO = "src/main/resources/VeraMono.ttf";
    
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

                    
                try {

                    myStream = new BufferedInputStream(new FileInputStream(FONT_PATH_VERAMONO));

                    GraphicsEnvironment ge = 
                        GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, myStream));
                    
                } catch (Exception e) {
                    System.out.println("Caught an Exception!" 
                    + " Error loading 'VeraMono.ttf'");
                    e.printStackTrace();
                    }
                 }       
            });
        }
    }
