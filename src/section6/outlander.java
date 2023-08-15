package section6;

public class outlander extends car{
    private int roadservice;

    public outlander(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadservice) {
        super("outlander", "4wd", 5, 5, 6, false);
        this.roadservice = roadservice;
    }

    public void accelerate(int rate){
        int newvelocity = getCurrentvelocity() + rate;
        if (newvelocity==0){
            stop();
            changegear(1);
        }
        else if (newvelocity>0 && newvelocity<= 10){
            changegear(1);
        }
        else if (newvelocity>10 && newvelocity<= 20){
            changegear(2);
        }
        else if (newvelocity>20 && newvelocity<= 40){
            changegear(3);
        }
        else if (newvelocity>40 && newvelocity<= 50){
            changegear(4);
        }

        else if (newvelocity>40 && newvelocity<= 70){
            changegear(5);
        }
        else{
            changegear(6);
        }
        if (newvelocity>0){
            changevelocity(newvelocity,getCurrentdirection());
        }
    }
}
