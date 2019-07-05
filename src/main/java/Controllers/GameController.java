package Controllers;

public class GameController {

    private HeroController hero = HeroController.getNewHero();
    private int playerX;
    private int playerY;
    private int mapDimensions;

    public GameController() {
    }

    public void setX(){


    }

    public void setY(){

    }

    public void setMapDimensions(int level){
        this.mapDimensions = (level - 1) * 5 + 10 - (level % 2);
    }

    public HeroController getHero(){

        return this.hero;
    }

    public int getMapDimensions(){
        return this.mapDimensions;
    }

}
