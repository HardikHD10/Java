package section9.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Isaveable {
    private String Name;
    private int Hitpoints;
    private int Strength;

    public Monster(String name, int hitpoints, int strength) {
        this.Name = name;
        this.Hitpoints = hitpoints;
        this.Strength = strength;
    }

    public String getName() {
        return Name;
    }

    public int getHitpoints() {
        return Hitpoints;
    }

    public int getStrength() {
        return Strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "Name='" + Name + '\'' +
                ", Hitpoints=" + Hitpoints +
                ", Strength=" + Strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.Name);
        values.add(1, "" + this.Hitpoints);
        values.add(2, "" + this.Strength);
        return values;
    }

    @Override
    public void read(List<String> savedvalues) {
        if (savedvalues != null && savedvalues.size() > 0) {
            this.Name = savedvalues.get(0);
            this.Hitpoints = Integer.parseInt(savedvalues.get(1));
            this.Strength = Integer.parseInt(savedvalues.get(2));
        }
    }
}