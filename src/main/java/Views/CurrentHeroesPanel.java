package Views;

import Controllers.CurrentHeroesController;

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

    public CurrentHeroesPanel(){ }

    public JPanel getPanel(){
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
            HeroButton.setActionCommand(ListofCurrentHeroes.get(i).getHeroName());
            HeroButton.addActionListener(new CurrentHeroesListener());
        }
        return this.panel;
    }

    public class CurrentHeroesListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();

            for(int i = 0; i < ListofCurrentHeroes.size(); i++){

                if (command.equals(ListofCurrentHeroes.get(i).getHeroName())){
                    System.out.println("Player wants : "+ ListofCurrentHeroes.get(i).getHeroName());
                }
            }
        }
    }
}
