package Models;
import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Enemies{

    private int EnemyX;
    private int EnemyY;
    private List<Enemies> enemyList = new ArrayList<Enemies>();
    private int mapDimensions;
    private int enemyStrength;
    private int enemyAttack;
    private String enemyClass;

    public Enemies(){

    }

    private void setX(int mapDimensions){
        this.EnemyX = ThreadLocalRandom.current().nextInt(mapDimensions );
        System.out.println("Enemy X: " + this.EnemyX);
    }
    private void setY(int mapDimensions){
        this.EnemyY = ThreadLocalRandom.current().nextInt( mapDimensions );
        System.out.println("Enemy Y: " + this.EnemyY);
    }

    public int getX(){
        return this.EnemyX;
    }
    public int getY(){
        return this.EnemyY;
    }

    public int getEnemyStrength(){

        return this.enemyStrength;
    }

    public int getEnemyAttack(){
        return this.enemyAttack;
    }

    private void setEnemyClass(){
        List<String> enemyclasses = new ArrayList<>();
        enemyclasses.add("Monarchy");
        enemyclasses.add("Greedy capitalist");
        enemyclasses.add("Bull dog");
        enemyclasses.add("Clown");
        enemyclasses.add("Soldier");
        enemyclasses.add("Protester");
        enemyclasses.add("Security guard");
        enemyclasses.add("Ghost");

        this.enemyClass = enemyclasses.get(ThreadLocalRandom.current().nextInt(7));
    }

    public String getEnemyClass(){
        return this.enemyClass;
    }

    private void setEnemyAttack(int heroAttack){

        this.enemyAttack = ThreadLocalRandom.current().nextInt(heroAttack + 10);
    }

    private void setEnemyStrength(int heroDefense){

        this.enemyStrength = ThreadLocalRandom.current().nextInt(heroDefense + 10);
    }

    public List<Enemies> generateEnemies(int mapDimensions, int heroAttack, int heroDefense){
        for (int i = 0; i < 50 ; i++){
            Enemies addEnemy = new Enemies();
            enemyList.add(addEnemy);
            addEnemy.setX(mapDimensions);
            addEnemy.setY(mapDimensions);
            addEnemy.setEnemyAttack(heroAttack);
            addEnemy.setEnemyStrength(heroDefense);
            addEnemy.setEnemyClass();
        }
        return enemyList;
    }

    public boolean heroFight(int heroAttack){

        if (heroAttack > this.enemyAttack){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean heroRun(int heroXp){
      int chance = ThreadLocalRandom.current().nextInt(heroXp);

      if (chance / 2 > 200){
          return true;
      }
      else{
          return false;
      }
    }
}
