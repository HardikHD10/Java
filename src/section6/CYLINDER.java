package section6;

public class CYLINDER extends circle{
    private double height;
    private double volume;

    public CYLINDER(double radius, double height) {
        super(radius);
        if (height<0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }
}
