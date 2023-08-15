package section3;

public class ifthenstatement {
    public static void main(String[] args){
        boolean alien = false;
        if (alien == false)
            System.out.println("it is not an alien!");
        else
            System.out.println("it may be a alien!");

        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You have got the top score!");
        }

        int secondscoretopscore = 60;
        if(topscore>secondscoretopscore && topscore < 100){
            System.out.println("result displayed!");
        }
        if (topscore>secondscoretopscore || topscore < 100){
            System.out.println("result displayed!");
        }

    }
}
