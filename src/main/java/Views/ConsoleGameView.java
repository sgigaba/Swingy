package Views;
import Controllers.*;
import com.sun.tools.javac.util.StringUtils;

import java.lang.reflect.Array;
import  java.util.*;


public class ConsoleGameView {

    GameController gameController = new GameController();
    HeroController heroController = HeroController.getNewHero();
    private int mapDimensions;
    private int playerLevel;
    private char player = '0';
    List <String> Map = new ArrayList<>();


    public ConsoleGameView(){
        playerLevel = heroController.getLevel();
        gameController.setMapDimensions(playerLevel);
        this.mapDimensions = gameController.getMapDimensions();

        System.out.println(this.mapDimensions);
      //  while(true){
            DrawMap();
        //}


    }

    public void DrawMap(){
        String mapChars= "";
         for (int i = 0; i < this.mapDimensions; i++) {
            System.out.println(i);
            if (i == 0) {

                mapChars = new String(new char[this.mapDimensions]).replace('\0', '*');
            }
            else if(i == this.mapDimensions - 1){
                mapChars = '*' + new String(new char[this.mapDimensions - 2]).replace('\0', '*') + '*';
            }
            else{
                mapChars ='*' + new String(new char[this.mapDimensions - 2]).replace('\0', ' ') + '*';
            }
            Map.add(mapChars);
        }



        String point = Map.get(this.mapDimensions / 2);
        String newName = point.substring(0, (this.mapDimensions / 2) - 2)+'x'+point.substring((this.mapDimensions / 2) - 1);
        Map.add(this.mapDimensions / 2, newName);

        System.out.println("Substring: ");
        System.out.println(this.mapDimensions / 2);

        for (int i = 0; i < this.Map.size(); i++){

            System.out.println(this.Map.get(i));
        }
        System.out.print("exit");


    }
}
