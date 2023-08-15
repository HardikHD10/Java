package section10.generics;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    @Override
    public int compareTo(@NotNull Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }
        else if (this.ranking() < team.ranking()){
            return 1;
        }
        else {
            return 0;
        }
    }

    private ArrayList <T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean AddPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team.");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() + " added successfully in the team "+ this.name);
            return true;
        }
    }

    public int numplayer(){
        return this.members.size();
    }

    public void matchresult(Team<T> opponent, int ourscore, int theirscore){
        String message;
        if (ourscore > theirscore){
            won++;
            message = " beat ";
        }
        else if (ourscore == theirscore){
            tied++;
            message = " drew with ";
        }
        else{
           lost++;
           message = " lost to ";
        }
        played++;
        if (opponent!= null){
            System.out.println(this.getName()+ message+ opponent.getName());
            opponent.matchresult(null, theirscore, ourscore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }
}
