package section7.example1;

public class Lamp {
    private String style;
    private int globrating;
    private boolean battery;

    public Lamp(String style, int globrating, boolean battery) {
        this.style = style;
        this.globrating = globrating;
        this.battery = battery;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobrating() {
        return globrating;
    }

    public boolean isBattery() {
        return battery;
    }

    public void  turnOn(){
        System.out.println("turning on");
    }
}
