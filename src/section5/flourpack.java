package section5;

public class flourpack {
    public static void main(String[] args) {
        System.out.println(canpack(1,0,4));
        System.out.println(canpack(1,0,5));
        System.out.println(canpack(0,5,4));
        System.out.println(canpack(2,2,11));
        System.out.println(canpack(-3,2,12));
    }
    public static boolean canpack(int bigcount,int smallcount, int goal){
        if( bigcount < 0 || smallcount < 0 || goal <0)
        {
            return false;
        }
        int r1 = bigcount*5;
        if(goal >= r1 + smallcount){
            return true;
        }
        else if(r1<goal)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
