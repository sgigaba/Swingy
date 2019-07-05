package Views;

import Controllers.CurrentHeroesController;
import Controllers.HeroController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleCurrentHeroes {

    CurrentHeroesController currentHeroesController = new CurrentHeroesController();
    List<CurrentHeroesController> ListOfCurrentHeroes = new ArrayList<>();
    HeroController hero = HeroController.getNewHero();
    String player = "";
    int playerIndex = 0;

    public ConsoleCurrentHeroes(){
        currentHeroesController.getCurrentHeroesList();
        ListOfCurrentHeroes = currentHeroesController.getListofCurrent();

        while(true){
            for(int i = 0; i < ListOfCurrentHeroes.size(); i++){
                System.out.println(i + ") " + ListOfCurrentHeroes.get(i).getHeroName() + " class: " + ListOfCurrentHeroes.get(i).getHeroClass());
            }

            System.out.println("Insert index of player to choose player");
            Scanner scanner = new Scanner(System.in);
            player = scanner.nextLine();
            playerIndex = Integer.parseInt(player);

            if (playerIndex >= 0 && playerIndex <= ListOfCurrentHeroes.size()){
                System.out.println("You have chosen the hero: " +ListOfCurrentHeroes.get(playerIndex).getHeroName());
                hero.setName(ListOfCurrentHeroes.get(playerIndex).getHeroName());
                hero.setClass(ListOfCurrentHeroes.get(playerIndex).getHeroClass());
                hero.setAttack(10);
                hero.setDefense(30);
                hero.setHitPoints(5);
                hero.setLevel(1);
                hero.setXp(0);
                ConsoleGameView startGame = new ConsoleGameView();
                return;
            }
        }
    }
}
