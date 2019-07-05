package Views;
import javax.swing.*;

public class MainFrame {

    private static MainFrame mainFrame = null;
    private JFrame frame = new JFrame();

    private MainFrame(){

    }

    public JFrame setFrameSpecs(){

        mainFrame.frame.setSize(600,600);
        mainFrame.frame.setLayout(null);
        mainFrame.frame.setVisible(true);
        return this.frame;
    }

    public static MainFrame createFrame(){
        if (mainFrame == null){
            mainFrame = new MainFrame();
            return mainFrame;
        }
        else{
            return mainFrame;
        }
    }

    public JFrame getFrame(){
        return this.frame;
    }
}
