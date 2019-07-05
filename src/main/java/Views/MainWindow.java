package Views;
import javax.swing.*;


public class MainWindow{

    MainFrame mainFrame = MainFrame.createFrame();
    JFrame frame = mainFrame.getFrame();
    StartupPanel startupPanel = new StartupPanel();
    NewHeroPanel newHeroPanel = new NewHeroPanel();
    CurrentHeroesPanel currentHeroesPanel = new CurrentHeroesPanel();
    DisplayHeroPanel displayHeroPanel = new DisplayHeroPanel();

    public MainWindow(){

    }

    public void StartUpWindow(){

        frame.add(startupPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void newHero(){
        if(startupPanel.getPanel().isVisible() == true) {
            startupPanel.getPanel().setVisible(false);
        }
        frame.add(newHeroPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayHero(){
        newHeroPanel.getPanel().setVisible(false);
        frame.add(displayHeroPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayCurrentHeroes(){
        startupPanel.getPanel().setVisible(false);
        frame.add(currentHeroesPanel.getPanel());
        mainFrame.setFrameSpecs();
    }
}
