package section4;

public class AreaCalculator {
    public static double area(double radius){
        if (radius<0){
            return -1.0;
        }
        double AREA = 3.14 *radius*radius;
        return AREA;
    }
    public static double area(double x, double y) {
        if (x<0 || y<0){
            return -1.0;
        }
        double Area = x*y;
        return Area;
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println(area(5.0,4.0));
    }
}
