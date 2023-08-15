package section7.example1;

public class bedroom {
    private String name;
    private wall Wall1;
    private wall Wall2;
    private wall Wall3;
    private wall Wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public bedroom(String name, wall wall1, wall wall2, wall wall3, wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        Wall1 = wall1;
        Wall2 = wall2;
        Wall3 = wall3;
        Wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public  void makebed(){
        System.out.println("bedroom --> making bed.");
        bed.make();
    }
}