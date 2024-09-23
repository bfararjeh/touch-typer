package components.GUI;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

/*
 * class that generates the frame to be used
 */
public class Frame extends JFrame {

    private JLabel labelOne;
    private JPanel mainPanel;
    private Font VeraMono;

    public Frame(){
        super("TouchTyper");

        // try/catch statement that pulls 'VeraMono.ttf'
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream iStream = classloader.getResourceAsStream("VeraMono.ttf");

            Font rawFont = Font.createFont(Font.TRUETYPE_FONT, iStream);
            VeraMono = rawFont.deriveFont(0, 50);

            GraphicsEnvironment ge = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(VeraMono);
            
        } catch (Exception e) {
            System.out.println("Caught an Exception!" 
            + " Error loading 'VeraMono.ttf'");
            e.printStackTrace();
            }


        setUIFont(new javax.swing.plaf.FontUIResource(VeraMono));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 750));
        setTitle("Touch Typing Trainer");  
        setResizable(false);
        setVisible(true);


        
        labelOne = new JLabel();
        labelOne.setText("A String");
        labelOne.setLayout(new BorderLayout());
        labelOne.setForeground(ColorScheme.text1);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.add(labelOne);
        mainPanel.setBackground(ColorScheme.background1);

        add(mainPanel);
        pack();
    }

    // function that ascertains all font is of correct "default" font
    @SuppressWarnings("rawtypes")
    public static void setUIFont (javax.swing.plaf.FontUIResource f){
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get (key);
            if (value instanceof javax.swing.plaf.FontUIResource)
            UIManager.put (key, f);
            }
        } 
}

