package section4;

public class methods {
    public static void main(String[] args){
        calculatescore(true,800,5,100);
        calculatescore(true,10000,8,200);
    }
    public static void calculatescore(boolean gameover,int score, int levelcompleted,int bonus){
        if(gameover){
            int finalscore = score +(levelcompleted*bonus);
            finalscore += 1000;
            System.out.println("your final score is "+ finalscore);
        }
    }
}
