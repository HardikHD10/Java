package section4;

import org.jetbrains.annotations.NotNull;

public class secondsandminutes {
    public static String getdurationstring(int minutes, int seconds) {
        if (minutes < 0 && (seconds > 59 || seconds < 0)) {
            return "invalid value";
        }
        int hour = minutes/60;
        int min = minutes - hour*60;
        int sec = seconds;
        String HOURSSTRING = hour +"h ";
        if (hour<10){
            HOURSSTRING= "0" + HOURSSTRING;
        }
        String abc = HOURSSTRING+ min +" m "+ sec + "s";
        System.out.println(minutes+" minutes "+seconds+" seconds = "+ abc);
        return abc;
    }
    public static String getdurationstring(int seconds) {
        if (seconds > 59 || seconds < 0){
            return "invalid value";
        }
        String ab = seconds +"S";
        System.out.println(seconds+" seconds = "+ ab);
        return ab;
    }

    public static void main(String[] args) {
        getdurationstring(198,56);
    }
}
