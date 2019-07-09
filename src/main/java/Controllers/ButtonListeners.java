package Controllers;

import Views.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListeners implements ActionListener{

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        MainWindow window = MainWindow.getMainWindow();
        if (command.equals("New Hero")){
            window.newHero();
            System.out.println("New Hero");
        }
        if (command.equals("Choose Hero")){
            CurrentHeroesController currentHeroesController = new CurrentHeroesController();
            window.displayCurrentHeroes();
            System.out.print("Choose Hero");
        }
        if (command.equals("add hero name")){
            System.out.print("Adding hero name");
        }
    }

}