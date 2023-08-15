package section6;

public class circle {
    private double radius;
    private double area;

    public circle(double radius) {
        if (radius <0){
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

}
