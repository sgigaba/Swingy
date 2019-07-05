package Views;

import Controllers.ButtonListeners;

import javax.swing.*;
import java.awt.*;

public class StartupPanel {

    private static JPanel panel = new JPanel(new GridLayout(2, 1));
    private static JButton newPlayerbutton = new JButton("New Player");
    private static JButton choosePlayerButton = new JButton("Choose Player");

    public StartupPanel(){
        panel.setBounds(200, 150, 200, 200);
        newPlayerbutton.setFont(new Font("Arial", Font.PLAIN, 20));
        choosePlayerButton.setFont(new Font("Arial", Font.PLAIN, 20));
        newPlayerbutton.setForeground(Color.MAGENTA);
        choosePlayerButton.setForeground(Color.MAGENTA);
        panel.add(newPlayerbutton);
        panel.add(choosePlayerButton);
        newPlayerbutton.setActionCommand("New Hero");
        newPlayerbutton.addActionListener(new ButtonListeners());

        choosePlayerButton.setActionCommand("Choose Hero");
        choosePlayerButton.addActionListener(new ButtonListeners());
    }

    public JPanel getPanel(){
        return panel;
    }

}
