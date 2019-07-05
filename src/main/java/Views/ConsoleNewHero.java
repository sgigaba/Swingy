package Views;

import Controllers.HeroController;

import java.util.Scanner;

public class ConsoleNewHero {

    HeroController hero = HeroController.getNewHero();
    Scanner scanner = new Scanner(System.in);


    public ConsoleNewHero(){

        while(true){
         System.out.println("Player name: ");
         hero.setName(scanner.nextLine());
         System.out.println("Set Player Class: ");
         hero.setClass(scanner.nextLine());
         hero.BuildHero();
         hero.setAttack(10);
         hero.setDefense(30);
         hero.setHitPoints(5);
         hero.setLevel(3);
         hero.setXp(0);
         ConsoleGameView startGame = new ConsoleGameView();
        }
    }
}