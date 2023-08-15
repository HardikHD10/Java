package section4;

public class BarkingDog {
    public static boolean shouldwakeup(boolean barking,int hoursoftheday ) {
        if(barking = true && ((hoursoftheday < 8 && hoursoftheday > 0) || (hoursoftheday < 23 && hoursoftheday > 22))){
            return true ;
        }
        else if (barking = false)
            return false;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldwakeup(true,1));
        System.out.println(shouldwakeup(true,8));
        System.out.println(shouldwakeup(true,-1));
    }
}
