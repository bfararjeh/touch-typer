package components.GUI;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

/*
 * class that generates the frame to be used
 */
@SuppressWarnings("unused")
public class Frame extends JFrame {

    private JLabel labelOne;
    private JPanel mainPanel;

    public Frame(){
        super("TouchTyper");

        // calls "setUiFont"
        setUIFont(new javax.swing.plaf.FontUIResource(
            "MONOSPACED",0, 50));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 750));
        setTitle("Touch Typing Trainer");  
        setResizable(false);
        setVisible(true);

        
        labelOne = new JLabel();
        labelOne.setText("A String");
        labelOne.setLayout(new BorderLayout());
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.CYAN);
        mainPanel.add(labelOne);

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

