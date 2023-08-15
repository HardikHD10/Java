package section4;

public class keywordsandexpressions {
    public static void main(String[] args) {
        // keywords are highlighted in orange in this version
        // expressions are collection of variable, values and operators
        //statements whitespaces and indentation
        int myvariable = 50;
        myvariable++;
        myvariable--;
        // if keywords and codeblocks
        // if else statement
        // else if
        boolean game = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;
        if (game == true) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score is " + finalscore);
        }
        score = 10000;
        levelcompleted = 8;
        bonus = 200;
        if (game == true) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score is " + finalscore);
        }
    }
}
