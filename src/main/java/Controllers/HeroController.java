package Controllers;
import Models.*;

import javax.validation.Validator;
import javax.validation.constraints.*;


public class HeroController {

    private static Validator validator;

    @Size(max=10, min = 5, message = "Name must be betweenn 5 and 10 characters")
    private String HeroName;
    private static String HeroClass;
    private static int    HeroLevel;
    private static int    HeroXp;
    private static int    HeroAttack;
    private static int    HeroDefense;
    private static int    HeroHitPoints;
    private static Hero   newHero;
    private static HeroController instance = null;

    private HeroController(){

    }

    public static HeroController getNewHero(){

        if (instance == null){
            instance = new HeroController();
            return instance;
        }
        else{
            return instance;
        }
    }

    public void BuildHero(){

    HeroBuilder heroBuilder = new HeroBuilder();
    heroBuilder.setAttack(this.HeroAttack).setName(HeroName).setClass(this.HeroClass)
            .setXp(this.HeroXp).setDefense(this.HeroDefense).setHitPoints(this.HeroHitPoints).setLevel(this.HeroLevel);
    this.newHero = heroBuilder.BuildHero();
    }

    public void setName(String name){
        this.HeroName = name;
    }

    public void setClass(String heroclass){
        this.HeroClass = heroclass;
    }

    public void setLevel(int level){
        this.HeroLevel = level;
    }

    public void setXp(int xp){
        this.HeroXp = xp;
    }

    public void setAttack(int attack){
        this.HeroAttack = attack;
    }

    public void setDefense(int defense){
        this.HeroDefense = defense;
    }

    public void setHitPoints(int hitpoints){
        this.HeroHitPoints = hitpoints;
    }

    public  String getName(){ return this.HeroName; }

    public  String getHeroClass(){ return this.HeroClass; }

    public int getLevel(){ return this.HeroLevel; }

    public int getHeroXp(){ return this.HeroXp; }

    public int getHeroAttack(){ return this.HeroAttack; }

    public int getHeroDefense(){ return this.HeroDefense; }

    public int getHeroHitPoints(){ return this.HeroHitPoints; }

    public Hero getHero(){

        return newHero;
    }
}
