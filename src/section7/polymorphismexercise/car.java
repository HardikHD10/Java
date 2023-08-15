package section7.polymorphismexercise;

public class car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine(){
        return "car's Engine is starting !";
    }


    public String accelerate(){
        return "Car is accelerating !";
    }


    public String brake(){
        return "Car is breaking!";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}

class mitsubishi extends car{
    public mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "mitsubishi is starting!";
    }

    @Override
    public String accelerate() {
        return "mitsubishi is accelerating!";
    }

    @Override
    public String brake() {
        return "mitsubishi is braking!";
    }
}
class Holden extends car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "holden is starting !";
    }

    @Override
    public String accelerate() {
        return "holden is accelerating!";
    }

    @Override
    public String brake() {
        return "holden is braking!";
    }
}
class ford extends car{
    public ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "ford is starting!";
    }

    @Override
    public String accelerate() {
        return "ford is accelerating!";
    }

    @Override
    public String brake() {
        return "ford is braking!";
    }
}
