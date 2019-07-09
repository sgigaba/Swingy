package Views;
import javax.swing.*;


public class MainWindow{

    private static MainWindow instance;
    MainFrame mainFrame = MainFrame.createFrame();
    JFrame frame = mainFrame.getFrame();
    StartupPanel startupPanel = new StartupPanel();
    NewHeroPanel newHeroPanel = new NewHeroPanel();
    CurrentHeroesPanel currentHeroesPanel = new CurrentHeroesPanel();
    DisplayHeroPanel displayHeroPanel = new DisplayHeroPanel();
    GuiGameView guiGameView = new GuiGameView();

    private MainWindow(){

    }

    public static MainWindow getMainWindow(){
        if (instance == null){
            instance = new MainWindow();
            return instance;
        }
        else{
            return instance;
        }
    }

    public void StartUpWindow(){

        frame.add(startupPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void newHero(){
        if(startupPanel.getPanel().isVisible() == true) {
            startupPanel.getPanel().setVisible(false);
        }
        newHeroPanel.generatePanel();
       frame.add(newHeroPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayHero(){
        newHeroPanel.getPanel().setVisible(false);
        frame.add(displayHeroPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayCurrentHeroes(){
        System.out.print("this panel");

        startupPanel.getPanel().setVisible(false);
        currentHeroesPanel.generatepanel();
        frame.add(currentHeroesPanel.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayGamePanel(){
        if(startupPanel.getPanel().isVisible() == true) {
            startupPanel.getPanel().setVisible(false);
        }
        if (displayHeroPanel.getPanel().isVisible() == true){
            displayHeroPanel.getPanel().setVisible(false);
        }
        newHeroPanel.generatePanel();
        if(newHeroPanel.getPanel().isVisible() == true){
            newHeroPanel.getPanel().setVisible(false);
        }
        //currentHeroesPanel.generatepanel();
        if(currentHeroesPanel.getPanel().isVisible() == true){
            System.out.print("true");
            currentHeroesPanel.getPanel().setVisible(false);
            System.out.print("invisible");
        }
        frame.add(guiGameView.getPanel());
        mainFrame.setFrameSpecs();
    }

    public void displayGame(){
        if(startupPanel.getPanel().isVisible() == true) {
            startupPanel.getPanel().setVisible(false);
        }
        if (displayHeroPanel.getPanel().isVisible() == true){
            displayHeroPanel.getPanel().setVisible(false);
        }
        newHeroPanel.generatePanel();
        if(newHeroPanel.getPanel().isVisible() == true){
            newHeroPanel.getPanel().setVisible(false);
        }
        currentHeroesPanel.generatepanel();
        if(currentHeroesPanel.getPanel().isVisible() == true){
            System.out.print("true");
            currentHeroesPanel.getPanel().setVisible(false);
            System.out.print("invisible");
        }

        frame.add(guiGameView.getPanel());
        mainFrame.setFrameSpecs();
    }
}
