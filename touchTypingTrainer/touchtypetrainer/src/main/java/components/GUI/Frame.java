package components.GUI;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

/*
 * class that generates the frame to be used
 */
public class Frame extends JFrame {

    private Font VeraMono;
    private GridBagLayout mainLayout;
    private GridBagConstraints gbc;
    private JPanel mainPanel;
    private JLabel labelOne;
    private JLabel labelTwo;

    public Frame(){
        super("TouchTyper");

        // try/catch statement that pulls 'VeraMono.ttf'
        try {
            ClassLoader classloader = 
            Thread.currentThread().getContextClassLoader();

            InputStream iStream = 
            classloader.getResourceAsStream("VeraMono.ttf");

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

        // initialises the frame properties
        setUIFont(new javax.swing.plaf.FontUIResource(VeraMono));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 750));
        setTitle("Touch Typing Trainer");  
        setResizable(false);
        setVisible(true);

        ComponentInitialiser compInit = new ComponentInitialiser();
        mainLayout = new GridBagLayout();
        gbc = new GridBagConstraints();

        mainPanel = new JPanel();
        mainPanel.setLayout(mainLayout);
        mainPanel.setBackground(ColorScheme.background1);
        add(mainPanel);

        labelOne = new JLabel();
        labelOne.setText("A String");
        labelOne.setForeground(ColorScheme.text1);

        labelTwo = new JLabel();
        labelTwo.setText("You should be able to change this text.");
        labelTwo.setFont(new Font("Monospaced", 1, 25));
        labelTwo.setForeground(ColorScheme.text1);

        compInit.addobjects(labelOne, mainPanel, mainLayout, 
        gbc, 0, 0, 1, 1);
        compInit.addobjects(labelTwo, mainPanel, mainLayout, 
        gbc, 0, 1, 1, 1);

        pack();
    }

/*
 * class that allows adding components simply in one line
 */
    public class ComponentInitialiser{

        public void addobjects( Component component, 
                                Container container, 
                                GridBagLayout layout, 
                                GridBagConstraints gbc, 
                                int gridx, 
                                int gridy, 
                                int gridwidth, 
                                int gridheight){
    
            gbc.gridx = gridx;
            gbc.gridy = gridy;
    
            gbc.gridwidth = gridwidth;
            gbc.gridheight = gridheight;

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.NONE;
    
            layout.setConstraints(component, gbc);
            container.add(component);
        }
    }

/*
 * class that sets default font to called font (e.g. "VeraMono")
 */
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

