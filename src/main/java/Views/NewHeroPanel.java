package Views;

import Controllers.HeroController;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewHeroPanel {

    private static JPanel panel = new JPanel(new GridLayout(5, 1));
    public JLabel label = new JLabel("New Hero");
    public JTextField inputName = new JTextField("input Name",10 );
    public JTextField inputClass = new JTextField("input Class" ,10);
    public JButton createNewHero = new JButton("Create New Hero");

    HeroController newHero = HeroController.getNewHero();

    public NewHeroPanel(){

    }

    public JPanel getPanel() {
        panel.setBounds(0, 0, 400, 200);

        panel.add(label);
        inputName.setToolTipText("input Hero Name here: ");
        panel.add(inputName);
        panel.add(inputClass);
        panel.add(createNewHero);
        inputName.setActionCommand("hero name");
        inputName.addActionListener(new newHeroListener());
        inputClass.setActionCommand("hero class");
        inputClass.addActionListener(new newHeroListener());
        createNewHero.setActionCommand("create hero");
        createNewHero.addActionListener(new newHeroListener());
        return panel;
    }

    public class newHeroListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            System.out.print(command);
            if(command.equals("hero name")){
                newHero.setName(inputName.getText());
                System.out.print(inputName.getText());
            }
            if(command.equals("hero class")){
                newHero.setClass(inputClass.getText());
            }
            if(command.equals("create hero")){
                newHero.setAttack(100);
                newHero.setDefense(100);
                newHero.setLevel(1);
                newHero.setHitPoints(100);
                newHero.BuildHero();
                System.out.print(newHero.getName());
                MainWindow mainWindow = new MainWindow();
                mainWindow.displayHero();
            }
        }
    }
}
