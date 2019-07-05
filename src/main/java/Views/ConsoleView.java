package Views;

import java.util.Scanner;

public class ConsoleView {

    private String player = "";
    public ConsoleView(){
        while(true){
            System.out.println("Press c to CHOOSE PLAYER | Press n to make NEW PLAYER");
            Scanner scanner = new Scanner(System.in);
            player = scanner.nextLine();
            if (player.equals("c")){
                ConsoleCurrentHeroes consoleCurrentHeroes = new ConsoleCurrentHeroes();
                return;
            }
            if (player.equals("n"))
            {
                ConsoleNewHero consoleNewHero = new ConsoleNewHero();
                System.out.print("n");
                return;
            }
        }
    }
}
