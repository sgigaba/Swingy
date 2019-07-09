package Controllers;
import Models.Enemies;
import Models.GameModel;

import java.util.*;

public class GameController {

    private HeroController hero = HeroController.getNewHero();

    GameModel gameModel = new GameModel();

    public GameController() {

    }

    public void setX(int x){
        gameModel.setX(x);
    }

    public void setXP(int level){
        gameModel.setXP(level);
    }

    public void setY(int y){
        gameModel.setY(y);
    }

    public int getX(){
        return gameModel.getX();
    }

    public int getY(){
        return gameModel.getY();
    }

    public void setMapDimensions(int level){
         gameModel.setMapDimensions(level);
    }

    public int getMapDimensions(){
        return gameModel.getMapDimensions();
    }

    public HeroController getHero(){
        return this.hero;
    }

    public void nextLevel(){
        gameModel.nextLevel();
    }

    public void enemyContact(int x, int y){

        gameModel.enemyContact(x, y);
    }
}
