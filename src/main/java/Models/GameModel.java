package Models;

import Controllers.HeroController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameModel {

    private HeroController hero = HeroController.getNewHero();
    private int playerX;
    private int playerY;
    private int mapDimensions;
    private Enemies enemyModel = new Enemies();
    private List<Enemies> enemiesList = new ArrayList<>();
    private Artefacts artefacts = new Artefacts(hero);

    public GameModel(){
    }

    public void setX(int x){
        this.playerX = x;
    }

    public void setXP(int level){
        hero.setXp(level);
    }

    public void setY(int y){
        this.playerY = y;
    }

    public int getX(){
        return this.playerX;
    }

    public int getY(){
        return this.playerY;
    }

    public void setMapDimensions(int level){
        this.mapDimensions = (level - 1) * 5 + 10 - (level % 2);
    }

    public void nextLevel(){
        hero.setLevel(hero.getLevel() + 1);
        hero.setAttack(hero.getHeroAttack() + 10);
        hero.setDefense(hero.getHeroDefense() + 10);
        setXP(hero.getLevel());
        setMapDimensions(hero.getLevel());
        setY(this.mapDimensions / 2);
        setX(this.mapDimensions / 2);
        enemiesList = enemyModel.generateEnemies(this.mapDimensions, hero.getHeroAttack(), hero.getHeroDefense());
    }

    public int getMapDimensions(){
        return this.mapDimensions;
    }

    public boolean enemyContact(int x, int y){

        Scanner scanner = new Scanner(System.in);
        String keyInput = "";
        for(int i = 0; i < enemiesList.size(); i++){
            if (enemiesList.get(i).getY() == y && enemiesList.get(i).getX() == x){
                System.out.println("\n \n \nYou have encountered a " + enemiesList.get(i).getEnemyClass() + " with Attack Power of : " +
                        enemiesList.get(i).getEnemyAttack() + " and Strength: " + enemiesList.get(i).getEnemyStrength());
                System.out.println("Press f to fight | Press r to run");
                keyInput = scanner.nextLine();
                if (keyInput.equals("r")){
                    try{
                        System.out.println("running...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        if (enemiesList.get(i).heroRun(hero.getHeroXp()) == true){
                            System.out.println(" You were able to run away, don't infringe on my territory again !");
                        }
                        else{
                            System.out.println(" I caught you, you lose!");
                            System.exit(1);
                        }
                    }catch(InterruptedException ex){

                    }
                }
                else if(keyInput.equals("f")) {
                    try{
                        System.out.println("fighting...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        Thread.sleep(1000);
                        System.out.println("...\n");
                        if (enemiesList.get(i).heroFight(hero.getHeroAttack()) == true){
                            System.out.println(" You won this fight !, but if I see you again you won't be as lucky !");
                            artefacts.generateArtefacts(enemiesList.get(i).getEnemyAttack());
                            System.out.print("You gain Artefact :  "+  artefacts.getArtefact());
                        }
                        else{
                            System.out.println(" DEFEATED! You lose");
                            System.exit(1);
                        }
                    }
                    catch(InterruptedException ex){

                    }

                }

                return true;
            }
        }
        return false;
    }

}
