package Views;

import Controllers.GameController;
import Controllers.HeroController;

import javax.swing.*;
import java.awt.*;

public class GuiGameView {

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    JLabel HeroStats;
    JLabel MapDimensions;
    JPanel directions = new JPanel(new GridLayout(4, 1));
    JButton North = new JButton("North");
    JButton East = new JButton("East");
    JButton West = new JButton("West");
    JButton South = new JButton("South");
    HeroController heroController = HeroController.getNewHero();


    GameController gameController = new GameController();

    public GuiGameView(){ }

    public JPanel getPanel(){
        panel.setBounds(0, 0, 600, 600);
        directions.setBounds(50, 50, 250, 2);
        HeroStats = new JLabel("Level : "+ heroController.getLevel()  + " "+ heroController.getName() + " | CurrentXp: " + heroController.getHeroXp() + " | Hit Points: " + heroController.getHeroHitPoints()
        + " | Defense" + heroController.getHeroDefense()
        );
        directions.add(North);
        directions.add(East);
        directions.add(West);
        directions.add(South);
        panel.add(HeroStats);
        panel.add(directions);
        return this.panel;
    }
}