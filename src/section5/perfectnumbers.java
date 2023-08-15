package section5;

public class perfectnumbers {
    public static void main(String[] args) {
        System.out.println(isperfectnumber(6));
        System.out.println(isperfectnumber(28));
        System.out.println(isperfectnumber(5));
        System.out.println(isperfectnumber(-1));
    }
    public static boolean isperfectnumber(int num){
        int sumdivisor = 0;
        if (num < 1)
        {
            return false;
        }
        for(int i =1; i < num; i++)
        {
            if (num % i == 0)
            {
                sumdivisor += i;
            }
        }
        if(sumdivisor == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
