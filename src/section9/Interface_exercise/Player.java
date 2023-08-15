package section9.Interface_exercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements Isaveable {
    private String name;
    private String weapon;
    private int hitpoints;
    private int strength;

    public Player(String name,int hitpoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List <String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitpoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedvalues) {
        if(savedvalues!= null && savedvalues.size()>0){

            this.name = savedvalues.get(0);
            this.hitpoints = Integer.parseInt(savedvalues.get(1));
            this.strength = Integer.parseInt(savedvalues.get(2));
            this.weapon = savedvalues.get(3);
        }
    }
}
