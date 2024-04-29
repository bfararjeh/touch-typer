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

        button1 = new JButton("Click me");
        button2 = new JButton("This is a long piece of text");
        textArea = new JTextArea("i love christmas");

        add(panel, BorderLayout.NORTH);
        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);
        add(textArea, BorderLayout.CENTER);

        pack();
    }
}