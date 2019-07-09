package Views;

import Controllers.CurrentHeroesController;
import Controllers.HeroController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrentHeroesPanel {

    JPanel panel;
    CurrentHeroesController currentHeroes = new CurrentHeroesController();
    List<CurrentHeroesController> ListofCurrentHeroes = new ArrayList<>();
    int listener = 0;

    public CurrentHeroesPanel(){ }

    public void generatepanel(){
        currentHeroes.getCurrentHeroesList();
        ListofCurrentHeroes = currentHeroes.getListofCurrent();
        panel = new JPanel(new GridLayout(ListofCurrentHeroes.size(), 1));
        panel.setBackground(Color.blue);
        panel.setBounds(0, 0, 600, 600);

        for(int i = 0; i < ListofCurrentHeroes.size(); i++){
            JButton HeroButton = new JButton(ListofCurrentHeroes.get(i).getHeroName() + "   : Class" + ListofCurrentHeroes.get(i).getHeroClass());
            HeroButton.setFont(new Font("Arial", Font.BOLD, 25));
            HeroButton.setForeground(Color.BLACK);
            panel.add(HeroButton);
            HeroButton.setActionCommand(Integer.toString(i));
            HeroButton.addActionListener(new CurrentHeroesListener());
        }
        System.out.print("out");
    }

    public JPanel getPanel(){
        return this.panel;
    }

    public class CurrentHeroesListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            listener++;
            String command = e.getActionCommand();
            System.out.print(ListofCurrentHeroes.get(Integer.parseInt(command)).getHeroName());
            HeroController newHero = HeroController.getNewHero();
            newHero.setName(ListofCurrentHeroes.get(Integer.parseInt(command)).getHeroName());
            newHero.setClass(ListofCurrentHeroes.get(Integer.parseInt(command)).getHeroName());
            newHero.setLevel(1);
            newHero.setAttack(10);
            newHero.setDefense(30);
            newHero.setHitPoints(5);
            newHero.setLevel(1);
            newHero.setXp(newHero.getLevel());
            MainWindow mainWindow = MainWindow.getMainWindow();
            mainWindow.displayGamePanel();
        }
    }
}
