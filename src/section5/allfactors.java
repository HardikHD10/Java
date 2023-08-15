package section5;

public class allfactors {
    public static void main(String[] args) {
    factors(6);
    factors(32);
    factors(10);
    factors(-1);
    }
    public static void factors(int number){
        if(number<1)
        {
            System.out.println("invalid value!");
        }
        for(int i = 1;i <= number;i++)
        {
            if(number % i == 0)
            {
                System.out.println(i );
            }
        }
    }
}
