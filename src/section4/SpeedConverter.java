package section4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0)
        {
           return -1;
        }
        return Math.round( kilometersPerHour / 1.609);
    }
    public static void PrintConversion(double kilometersPerHour){
        if (kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        long milePerHour = Math.round(kilometersPerHour/1.609);
        System.out.println(kilometersPerHour+"km/h="+milePerHour+"mi/h");
    }
    public static void main(String[] args){
        System.out.println(toMilesPerHour(10.5));
        PrintConversion(10.5);
    }
}
