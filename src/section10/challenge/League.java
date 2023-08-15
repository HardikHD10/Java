package section10.challenge;

import section10.generics.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList <T> league = new ArrayList <>();

    public boolean addteam(T teams){
        if(league.contains(teams)){
            System.out.println(teams.getName() + " already added in the league");
            return false;
        }
        else{
            league.add(teams);
            System.out.println(teams.getName()+" added to the league");
            return true;
        }
    }

    public void showleaguetables(){
        Collections.sort(league);
        for(T t : league){
            System.out.println(t.getName()+" : "+ t.ranking());
        }
    }

}
