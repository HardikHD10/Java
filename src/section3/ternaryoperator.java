package section3;

public class ternaryoperator {
    public static void main(String[] args){
        boolean iscar = true;
        boolean wascar = iscar ? true : false ;
        if (wascar){
            System.out.println("wascar is true!");
        }
        int ageofclient = 20;
        boolean isageofclientovereighteen = (ageofclient == 20) ? true : false;
    }
}
