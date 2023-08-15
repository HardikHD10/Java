package section6;

public class cuboid extends Rectangle{
    private double height;
    private double volume;

    public cuboid(double length, double width, int height) {
        super(length, width);
        if(height<0){
            this.height =0;
        }
        else {
            this.height = height;
        }
    }

    public double getVolume() {
        return getArea()*height;
    }

    public double getHeight() {
        return height;
    }
}
