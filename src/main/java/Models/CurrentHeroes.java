package Models;
import java.io.*;
import java.util.*;


public class CurrentHeroes {

    private String HeroName;
    private String HeroClass;
    private File file;
    private String line = "";
    private List <String> input = new ArrayList<String>();
    private List<CurrentHeroes> listOfHeroes = new ArrayList<CurrentHeroes>();

    public CurrentHeroes(){

    }

    public void readFile(){

        file = new File("/goinfre/sgigaba/IdeaProjects/Swingy/src/main/java/Models/heroes.txt");
        try{
            BufferedReader textfile = new BufferedReader(new FileReader(file));
            try{

                while((line = textfile.readLine()) != null) {
                    input.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        for(int i = 0; i < input.size(); i++){
            String details[] = input.get(i).split(",");
            CurrentHeroes currentHeroObj = new CurrentHeroes();
                currentHeroObj.setHeroName(details[0].trim());
                currentHeroObj.setHeroClass(details[1].trim());
                listOfHeroes.add(currentHeroObj);
        }
    }

    private void setHeroName(String name){

        this.HeroName = name;
    }

    private void setHeroClass(String heroClass){

        this.HeroClass = heroClass;
    }

    public String getHeroName(){
        return this.HeroName;
    }

    public String getHeroClass(){
        return this.HeroClass;
    }

    public List<CurrentHeroes> getListOfHeroes() {
        return this.listOfHeroes;
    }
}
