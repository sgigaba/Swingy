package Models;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import Controllers.HeroController;

public class Artefacts {

    private String artefact;
    private HeroController heroController = HeroController.getNewHero();

    public Artefacts(HeroController hero){
        this.heroController = hero;
    }

    private void setArtefact(int EnemyStrength){
        List<String> artefactList = new ArrayList<>();
        artefactList.add("Rusty nail");
        artefactList.add("Tooth pick");
        artefactList.add("Water");
        artefactList.add("Comb");
        artefactList.add("Sword");
        artefactList.add("Shield");
        artefactList.add("Horse");
        artefactList.add("food");

        if (EnemyStrength < 100){
            this.artefact = artefactList.get(ThreadLocalRandom.current().nextInt(3));
        }
        else{
            this.artefact = artefactList.get(ThreadLocalRandom.current().nextInt(3,7));
        }
    }
    public String getArtefact(){
        return this.artefact;
    }

    public void generateArtefacts(int EnemyStrength){
        setArtefact(EnemyStrength);
    }
}
