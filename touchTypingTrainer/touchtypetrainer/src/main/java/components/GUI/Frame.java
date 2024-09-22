package components.GUI;

import javax.swing.*;
import java.awt.*;

/*
 * class that generates the frame to be used
 */
public class Frame extends JFrame {

    private JButton button1;
    private JButton button2;
    private JPanel panel;
    private JTextArea textArea;


    public Frame(){
        super("TouchTyper");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 750));
        setTitle("Touch Type Trainer");  
        setResizable(false);
        setVisible(true);
        
        
        setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        button1 = new JButton("Click me");
        button1.setMaximumSize(new Dimension(400, 400));

        button2 = new JButton("This is a long piece of text");

        textArea = new JTextArea("i love christmas");
        textArea.setMaximumSize(new Dimension(1750, 200));

        add(panel, BorderLayout.CENTER);

        panel.add(button1, Component.CENTER_ALIGNMENT);
        panel.add(button2);
        panel.add(textArea);

        pack();
    }
}