package components.GUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * this class contains functions for initialising the GUI
 * addObjects - function for adding objects via gridbaglayout
 * textFieldLabelChange - function that adds a documentlistener for a text field
 *  allowing it to update a label as you type
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



    public void textFieldLabelChange(
        JLabel masterLabel,
        JTextField masterField
    ){

        masterField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabelFromTextField(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabelFromTextField(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLabelFromTextField(e);
            }

            public void updateLabelFromTextField(DocumentEvent e){
                masterLabel.setText(masterField.getText());
                // TO-DO text validation
            }
            
        });
    }
}
