package Views;
import Controllers.*;


import java.lang.reflect.Array;
import  java.util.*;


public class ConsoleGameView {

    GameController gameController = new GameController();
    HeroController heroController = HeroController.getNewHero();
    private int mapDimensions;
    private int playerY = 0;
    private int playerX = 0;
    private int playerLevel;
    private char player = '0';
    private String keyInput = "";
    List <String> Map;

    public ConsoleGameView() {
        playerLevel = heroController.getLevel();
        gameController.setMapDimensions(playerLevel);
        this.mapDimensions = gameController.getMapDimensions();
        gameController.setY(this.mapDimensions/2);
        gameController.setX(this.mapDimensions/2);


        Scanner scanner = new Scanner(System.in);

        System.out.println(this.mapDimensions);

        while(true){
            System.out.flush();
            this.mapDimensions = gameController.getMapDimensions();
            this.playerY = gameController.getY();
            this.playerX = gameController.getX();
            System.out.println("Level " + heroController.getLevel());
            System.out.println(heroController.getName() + " | " + heroController.getHeroClass() + " | " + "Current XP : " + heroController.getHeroXp()

            + " | " + "Current Attack Amount : " + heroController.getHeroAttack() + " | " + "Current hit points : "+ heroController.getHeroHitPoints()
            + " | " + "Current Defense points : " + heroController.getHeroDefense());
            DrawMap();
            keyInput = scanner.nextLine();
            if (keyInput.equals("w")){
                if (this.playerY == 1){
                    gameController.nextLevel();
                }else{
                    gameController.setY(this.playerY - 1);
                    gameController.enemyContact(playerX, playerY);
                }
            }
            if (keyInput.equals("s")){
                if (this.playerY == this.mapDimensions - 2){
                    gameController.nextLevel();
                }
                else{
                    gameController.setY(this.playerY + 1);
                    gameController.enemyContact(playerX, playerY);
                }
            }
            if(keyInput.equals("a")){
                if (this.playerX == 1){
                 gameController.nextLevel();
                }
                else{
                    gameController.enemyContact(playerX, playerY);
                    gameController.setX(this.playerX - 1);
                }
            }
            if (keyInput.equals("d")){
                if (this.playerX == this.mapDimensions - 1){
                    gameController.nextLevel();
                }
                else{
                    gameController.enemyContact(playerX, playerY);
                    gameController.setX(this.playerX + 1);
                }
            }
        }
    }

    public void DrawMap(){
        String mapChars= "";
        Map = new ArrayList<>();
         for (int i = 0; i < this.mapDimensions; i++) {
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
        String point = Map.get(playerY);
        String newName = point.substring(0, (playerX))+'x'+point.substring((playerX) + 1);
        Map.add((playerY), newName);
        for (int i = 0; i < this.Map.size(); i++){
            System.out.println(this.Map.get(i));
        }
    }
}
