package section6;

public class vehicle {
    private String name;
    private String size;
    private int currentvelocity;
    private int currentdirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentdirection = 0;
        this.currentvelocity = 0;
    }

    public void steer(int direction) {
        this.currentdirection += direction;
        System.out.println("vehicle. steer (): steering at " + currentdirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentvelocity = velocity;
        currentdirection = direction;
        System.out.println("vehicle. move (): moving at " + currentvelocity + " in direction " + currentdirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void stop(){
        this.currentvelocity = 0;
    }
}
