
import Views.ConsoleView;
import Views.MainWindow;

public class Main {



    public static void main(String args[]){

        String gametype = "";

        if (args.length > 0){
                gametype = args[0];

            if (gametype.contains("console")){
                ConsoleView consoleView = new ConsoleView();
            }
            else if (gametype.contains("gui")){
                MainWindow mainwindow = new MainWindow();
                mainwindow.StartUpWindow();
            }
        }


    }

}
