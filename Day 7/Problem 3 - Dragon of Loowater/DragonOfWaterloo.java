import java.util.*;

class Game{
    private String status;

    public Game(){}

    public void setStatus(String theStatus){
        this.status = theStatus;
    }

    public String getStatus(){
        return this.status;
    }
}

class Dragon extends Game{
    private ArrayList<Integer> dgDiameter;

    Dragon(){}

    public void setDragonDiameter(ArrayList<Integer> diameter){
        this.dgDiameter = diameter;
    }

    public ArrayList<Integer> getDragonDiameter(){
        return this.dgDiameter;
    }
}

class Knight extends Game{
    private ArrayList<Integer> knHeight;

    Knight(){}

    public void setKnightHeight(ArrayList<Integer> height){
        this.knHeight = height;
    }

    public ArrayList<Integer> getKnightHeight(){
        return this.knHeight;
    }
}


public class DragonOfWaterloo{
    public static void main(String[] args){
        Dragon enemy = new Dragon();
        ArrayList<Integer> listDragon = new ArrayList<Integer>();
        listDragon.add(5);
        listDragon.add(4);
        enemy.setDragonDiameter(listDragon);

        Knight heroes = new Knight();
        ArrayList<Integer> listKnight = new ArrayList<Integer>();
        listKnight.add(7);
        listKnight.add(8);
        listKnight.add(4);
        heroes.setKnightHeight(listKnight);

        ArrayList<Integer> potentialHeroes = new ArrayList<Integer>();
        Integer minimumKnightHP = 0;

        for(Integer i = 0; i < enemy.getDragonDiameter().size(); i++){
            for(Integer j = 0; j < heroes.getKnightHeight().size(); j++){
                if(heroes.getKnightHeight().get(j) >= enemy.getDragonDiameter().get(i)){
                    potentialHeroes.add(heroes.getKnightHeight().get(j));
                }
            }
            Collections.sort(potentialHeroes);
            potentialHeroes.subList(1, potentialHeroes.size()).clear();
            minimumKnightHP += potentialHeroes.get(0);
        }

        System.out.println("Output : " + minimumKnightHP);
    }
}