package section4;

public class PlayingCat {
    public static boolean iscatplaying(boolean Summer,int temp){
        if (Summer == true){
            if (temp >=25 && temp<=45){
                return true;
            }
            else{
                return false;
            }
        }
        else if(Summer == false){
            if (temp >= 25 && temp <=35){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(iscatplaying(true,10));
        System.out.println(iscatplaying(false,36));
        System.out.println(iscatplaying(false,35));
    }
}

