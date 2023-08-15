package section6;

public class car extends vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentgear;

    public car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentgear = 1;
    }

    public void changegear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println("car. set() current gear(): changed to  "+this.currentgear + " gear.");
    }

    public void changevelocity(int speed, int direction){
        System.out.println("car. change velovity(): velocity "+ speed+ " direction"+ direction);
        move(speed, direction);
    }


}
