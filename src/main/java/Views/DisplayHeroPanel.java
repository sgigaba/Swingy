package Views;

import Controllers.HeroController;

import javax.swing.*;
import java.awt.*;

public class DisplayHeroPanel {

    public JPanel panel = new JPanel(new GridLayout(5, 1));

    HeroController hero = HeroController.getNewHero();
    public JLabel nameLabel = new JLabel("Hero: " + hero.getName());
    public JLabel classLabel = new JLabel("Class: " + hero.getHeroClass());
    public JLabel levelLabel = new JLabel("Class: " + hero.getLevel());
    public JLabel xpLabel = new JLabel("Class: " + hero.getHeroXp());

    public DisplayHeroPanel(){
        panel.setBounds(0, 0, 400, 500);
        panel.add(nameLabel);
        panel.add(classLabel);
        panel.add(levelLabel);
        panel.add(xpLabel);
    }

    public JPanel getPanel(){
        return this.panel;
    }
}
