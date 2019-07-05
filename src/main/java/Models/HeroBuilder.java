package Models;

public class HeroBuilder{

        private String HeroName;
        private String HeroClass;
        private int    HeroLevel;
        private int    HeroXp;
        private int    HeroAttack;
        private int    HeroDefense;
        private int    HeroHitPoints;

        public HeroBuilder(){

        }

        public Hero BuildHero(){

            return new Hero(HeroName, HeroClass, HeroLevel, HeroXp, HeroAttack, HeroDefense, HeroHitPoints);
        }

        public HeroBuilder setName(String name){
            this.HeroName = name;
            return this;
        }

        public HeroBuilder setClass(String heroclass){
            this.HeroClass = heroclass;
            return this;
        }

        public HeroBuilder setLevel(int level){
            this.HeroLevel = level;
            return this;
        }

        public HeroBuilder setXp(int Xp){
            this.HeroXp = Xp;
            return this;
        }

        public HeroBuilder setAttack(int attack){
            this.HeroAttack = attack;
            return this;
        }

        public HeroBuilder setDefense(int defense){
            this.HeroDefense = defense;
            return this;
        }

        public HeroBuilder setHitPoints(int hitpoints){
            this.HeroHitPoints = hitpoints;
            return this;
        }

    }

