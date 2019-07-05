package Controllers;
import Models.*;

import java.util.ArrayList;
import java.util.List;

public class CurrentHeroesController {

    private String heroName;
    private String heroClass;

    CurrentHeroes currentHeroes = new CurrentHeroes();
    private List<CurrentHeroes> listOfHeroes = new ArrayList<CurrentHeroes>();
    public List<CurrentHeroesController> listofCurrent = new ArrayList<CurrentHeroesController>();

    public CurrentHeroesController(){

    }

    public void getCurrentHeroesList(){

        currentHeroes.readFile();
        listOfHeroes = currentHeroes.getListOfHeroes();


        for(int i = 0; i < listOfHeroes.size(); i++){
            CurrentHeroesController currentObj = new CurrentHeroesController();
            currentObj.setHeroName(listOfHeroes.get(i).getHeroName());
            currentObj.setHeroClass(listOfHeroes.get(i).getHeroClass());
            listofCurrent.add(currentObj);
        }
    }

    private void setHeroName(String name){

        this.heroName = name;
    }

    private void setHeroClass(String heroClass){
        this.heroClass = heroClass;
    }

    public String getHeroName (){
        return this.heroName;
    }

    public String getHeroClass(){
        return this.heroClass;
    }

    public List<CurrentHeroesController> getListofCurrent(){

        return this.listofCurrent;
    }

}
