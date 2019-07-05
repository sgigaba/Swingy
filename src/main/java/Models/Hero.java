package Models;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Hero {
    private String HeroName;
    private String HeroClass;
    private int    HeroLevel;
    private int    HeroXp;
    private int    HeroAttack;
    private int    HeroDefense;
    private int    HeroHitPoints;

    public Hero(String HeroName, String HeroClass, int HeroLevel, int HeroXp, int HeroAttack, int HeroDefense, int HeroHitPoints){
        this.HeroName = HeroName;
        this.HeroClass = HeroClass;
        this.HeroLevel = HeroLevel;
        this.HeroXp = HeroXp;
        this.HeroAttack = HeroAttack;
        this.HeroDefense = HeroDefense;
        this.HeroHitPoints = HeroHitPoints;
    }
}
